package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.repositorys.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * PayrollController
 *
 * Used to handle all the requests for the Payroll entity
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class PayrollController {

    @Autowired
    private PayrollRepository payrollRepository;

    /**
     * Get all payroll objects from the database
     * @return List of payroll objects
     */
    @GetMapping("/payroll")
    public List<Payroll> getAllPayroll() { return payrollRepository.findAll(); }

    /**
     * Get a payroll object from the database by its id
     * @param id of the payroll object
     * @return Payroll object
     */
    @GetMapping("/payroll/{id}")
    public ResponseEntity<Payroll> getPayrollByID(@PathVariable Long id) {
        Payroll payroll = payrollRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Payroll Object found with id: " + id));
        return ResponseEntity.ok(payroll);
    }

    /**
     * Get a payroll object from the database by its employee id
     * @param id of the employee
     * @return List of payroll objects belonging to the employee
     */
    @GetMapping("/payroll/eid/{id}")
    public List<Payroll> getPayrollByEmployeeID(@PathVariable Long id) { return payrollRepository.findByEmployeeId(id); }

    /**
     * Create a new payroll object in the database
     * @param payroll Payroll object to be created
     * @return Payroll object
     */
    @PostMapping("/new-payroll")
    public ResponseEntity<Payroll> createPayroll (@RequestBody Payroll payroll) {
        Payroll p = payrollRepository.save(payroll);

        return ResponseEntity.ok(p);
    }

    /**
     * Retrieve all the payroll objects from the database that by if they are processed or not
     * @param id of the isProcessed field in the payroll object. 1 for processed, 0 for not processed
     * @return List of payroll objects
     */
    @GetMapping("/payroll/is-processed/{id}")
    public List<Payroll> getPayrollByIsProcessed(@PathVariable int id) { return payrollRepository.findByIsProcessed(id); }

    /**
     * Update a payroll object in the database
     * @param id of the payroll object
     * @param newPayroll Payroll object to be updated
     * @return Updated payroll object
     */
    @PutMapping("/update-payroll/{id}")
    public ResponseEntity<Payroll> updateEmployee(@PathVariable Long id, @RequestBody Payroll newPayroll){
        Payroll payroll = payrollRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No payroll found with this id :" + id));

        Payroll updatedPayroll = payrollRepository.save(newPayroll);
        return ResponseEntity.ok(updatedPayroll);
    }
}
