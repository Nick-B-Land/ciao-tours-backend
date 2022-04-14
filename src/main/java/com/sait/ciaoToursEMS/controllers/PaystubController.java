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

/**
 * PaystubController
 * Responsible for handling all requests related to creation retrieval of paystub objects
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PaystubController {

    @Autowired
    private PaystubRepository paystubRepository;

    /**
     * Get all paystubs objects stored in the database
     * @return List of paystub objects
     */
    @GetMapping("/paystubs")
    public List<Paystub> getAllPaystubs() { return paystubRepository.findAll(); }

    /**
     * Create a new paystub object
     * @param paystub Paystub object to be created
     * @return Paystub object created
     */
    @PostMapping("/new-paystub")
    public ResponseEntity<Paystub> createPaystub (@RequestBody Paystub paystub) {
        Paystub p = paystubRepository.save(paystub);

        return ResponseEntity.ok(p);
    }

    /**
     * Get a paystub object by id
     * @param id Id of the paystub object to be retrieved
     * @return Paystub object
     */
    @GetMapping("/paystubs/{id}")
    public ResponseEntity<Paystub> getPayrollByID(@PathVariable Long id) {
        Paystub paystub = paystubRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Payroll Object found with id: " + id));
        return ResponseEntity.ok(paystub);
    }

    /**
     * get all paystub objects by employee id
     * @param id Id of the employee
     * @return List of paystub objects for an employee
     */
    @GetMapping("/paystubs/employee/{id}")
    public List<Paystub> getPayrollByEmployeeID(@PathVariable Long id) {
        return paystubRepository.findByEmployeeId(id);
    }

    /**
     * get all paystub objects by date
     * @param date Date of the paystub
     * @return List of paystub objects for a payroll date
     */
    @GetMapping("/paystubs/date/{date}")
    public List<Paystub> getPayrollByIsProcessed(@PathVariable Date date) {
        return paystubRepository.findByDateOfPaystub(date);
    }


}
