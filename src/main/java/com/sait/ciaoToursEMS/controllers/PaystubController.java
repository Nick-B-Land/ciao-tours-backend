package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.model.Paystub;
import com.sait.ciaoToursEMS.repositorys.PayrollRepository;
import com.sait.ciaoToursEMS.repositorys.PaystubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PaystubController {

    @Autowired
    private PaystubRepository paystubRepository;

    @GetMapping("/paystubs")
    public List<Paystub> getAllPaystubs() { return paystubRepository.findAll(); }

    @PostMapping("/new-paystub")
    public ResponseEntity<Paystub> createPaystub (@RequestBody Paystub paystub) {
        Paystub p = paystubRepository.save(paystub);

        return ResponseEntity.ok(p);
    }

    @GetMapping("/paystubs/{id}")
    public ResponseEntity<Paystub> getPayrollByID(@PathVariable Long id) {
        Paystub paystub = paystubRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Payroll Object found with id: " + id));
        return ResponseEntity.ok(paystub);
    }

    @GetMapping("/paystubs/employee/{id}")
    public List<Paystub> getPayrollByEmployeeID(@PathVariable Long id) {
        return paystubRepository.findByEmployeeId(id);
    }

    @GetMapping("/paystubs/date/{date}")
    public List<Paystub> getPayrollByIsProcessed(@PathVariable Date date) {
        return paystubRepository.findByDateOfPaystub(date);
    }


}
