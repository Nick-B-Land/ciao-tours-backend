package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.model.PayrollData;
import com.sait.ciaoToursEMS.repositorys.PayrollDataRepository;
import com.sait.ciaoToursEMS.repositorys.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PayrollDataController {

    @Autowired
    private PayrollDataRepository payrollDataRepository;

    @Autowired
    private PayrollRepository payrollRepository;

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
    public PayrollData createPayroll (@RequestBody PayrollData payrollData) {
        Payroll p = payrollRepository.getById(payrollData.getPayrollId());

        payrollData.setPayroll(p);

        return payrollDataRepository.save(payrollData);
    }

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
