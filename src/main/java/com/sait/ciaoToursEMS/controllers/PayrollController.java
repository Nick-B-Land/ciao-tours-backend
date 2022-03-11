package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.repositorys.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PayrollController {

    @Autowired
    private PayrollRepository payrollRepository;

    //get all payroll
    @GetMapping("/payroll")
    public List<Payroll> getAllPayroll() { return payrollRepository.findAll(); }

    // get payroll by id
    @GetMapping("/payroll/{id}")
    public ResponseEntity<Payroll> getPayrollByID(@PathVariable Long id) {
        Payroll payroll = payrollRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Payroll Object found with id: " + id));
        return ResponseEntity.ok(payroll);
    }

    @GetMapping("/payroll/eid/{id}")
    public List<Payroll> getPayrollByEmployeeID(@PathVariable Long id) { return payrollRepository.findByEmployeeId(id); }

    @PostMapping("/new-payroll")
    public ResponseEntity<Payroll> createPayroll (@RequestBody Payroll payroll) {
        Payroll p = payrollRepository.save(payroll);

        return ResponseEntity.ok(p);
    }

    @GetMapping("/payroll/is-processed/{id}")
    public List<Payroll> getPayrollByIsProcessed(@PathVariable int id) { return payrollRepository.findByIsProcessed(id); }
}
