package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sait.ciaoToursEMS.repositorys.EmployeeRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();

    }

    @GetMapping("/testAuth")
    //@PreAuthorize("hasRole('ADMIN') or hasRole('BOOKKEEPER')")
    public String adminAccess() {
        return "Must be admin or bookkeeper to see this";
    }

    @GetMapping("/testEmp")
    //@PreAuthorize("hasRole('EMPLOYEE')")
    public String empAccess() {
        return "Must be employee to see this";
    }

}
