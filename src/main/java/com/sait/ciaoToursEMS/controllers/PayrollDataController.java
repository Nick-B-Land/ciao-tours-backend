package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.PayrollData;
import com.sait.ciaoToursEMS.repositorys.PayrollDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PayrollDataController
 * Handles all the request for payroll data entity
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PayrollDataController {

    @Autowired
    private PayrollDataRepository payrollDataRepository;

    /**
     * Get all payroll data objects
     * @return
     */
    @GetMapping("/payroll-data")
    public List<PayrollData> getAllPayroll() { return payrollDataRepository.findAll(); }

    /**
     * Get payroll data object by id
     * @param id id of the payroll data object
     * @return PayrollData object
     */
    @GetMapping("/payroll-data/{id}")
    public ResponseEntity<PayrollData> getPayrollDataByID(@PathVariable Long id) {
        PayrollData payrollData = payrollDataRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Payroll Object found with id: " + id));
        return ResponseEntity.ok(payrollData);
    }

    /**
     * Get payroll data object by id
     * @param id PayrollData object id
     * @return PayrollData object
     */
    @GetMapping("/payroll-data-by-payroll/{id}")
    public ResponseEntity<List<PayrollData>> getAllPayrollDataByPayrollID(@PathVariable Long id) {
        List <PayrollData> payrollData = payrollDataRepository.findByPayrollId(id);
        return ResponseEntity.ok(payrollData);
    }

    /**
     * Create a new payroll data object
     * @param payrollData PayrollData object
     * @return PayrollData object
     */
    @PostMapping("/new-payroll-data")
    public PayrollData createPayroll (@RequestBody PayrollData payrollData) { return payrollDataRepository.save(payrollData); }

    /**
     * Delete a payroll data object by id
     * @param id id of the payroll data object
     * @return ResponseEntity
     */
    @DeleteMapping("/delete-payroll-data/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePayrollData(@PathVariable Long id){
        PayrollData payrollData = payrollDataRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No payroll data found with this id  :" + id));

        payrollDataRepository.delete(payrollData);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
