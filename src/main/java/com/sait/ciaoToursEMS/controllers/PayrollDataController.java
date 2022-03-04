package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.PayrollData;
import com.sait.ciaoToursEMS.repositorys.PayrollDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PayrollDataController {

    @Autowired
    private PayrollDataRepository payrollDataRepository;

    //get all payroll data
    @GetMapping("/payroll-data")
    public List<PayrollData> getAllPayroll() { return payrollDataRepository.findAll(); }

    // get payroll data by id
    @GetMapping("/payroll-data/{id}")
    public ResponseEntity<PayrollData> getPayrollDataByID(@PathVariable Long id) {
        PayrollData payrollData = payrollDataRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Payroll Object found with id: " + id));
        return ResponseEntity.ok(payrollData);
    }

    // get all payroll data by payroll id
    //this is untested and will probably require tweaking
    @GetMapping("/payroll-data-by-payroll/{id}")
    public ResponseEntity<List<PayrollData>> getAllPayrollDataByPayrollID(@PathVariable Long id) {
        List <PayrollData> payrollData = payrollDataRepository.findByPayrollId(id);
        return ResponseEntity.ok(payrollData);
    }

    @PostMapping("/new-payroll-data")
    public PayrollData createPayroll (@RequestBody PayrollData payrollData) { return payrollDataRepository.save(payrollData); }

}
