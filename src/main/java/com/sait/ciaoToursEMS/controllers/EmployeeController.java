package com.sait.ciaoToursEMS.controllers;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.Payroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.sait.ciaoToursEMS.repositorys.EmployeeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EmployeeController
 * Handles all employee related requests such as creating, updating, deleting, and retrieving employees.
 */
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Get all employees from the database
     * @return List of employees
     */
    @GetMapping("/employees")
    //@PreAuthorize("hasRole('ADMIN') or hasRole('HR')")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Get an employee from the database by id
     * @param id Employee id
     * @return Employee object
     */
    @GetMapping("/employees/{id}")
    public List<Employee> getEmployeeById(@PathVariable Long id) { return employeeRepository.findByEmployeeId(id); }

    /**
     * Create an employee in the database
     * @param employee
     * @return A new employee object with updated id
     */
    @PostMapping("/new-employee")
    // @PreAuthorize("hasRole('ADMIN') or hasRole('HR')")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Update an employee in the database
     * @param id Employee id
     * @param employeeDetails Employee object with the new updated information
     * @return Updated employee object
     */
    @PutMapping("/update-employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No employee found with this id :" + id));

        Employee updatedEmployee = employeeRepository.save(employeeDetails);
        return ResponseEntity.ok(updatedEmployee);
    }

    /**
     * Delete an employee from the database by id
     * @param id Employee id
     * @return Map of success and message
     */
    @DeleteMapping("/delete-employee/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No employee found with this id  :" + id));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    /**
     * End point used to test the employee access
     * @return String message
     */
    @GetMapping("/testAuth")
    //@PreAuthorize("hasRole('ADMIN') or hasRole('BOOKKEEPER')")
    public String adminAccess() {
        return "Must be admin or bookkeeper to see this";
    }

    /**
     * End point used to test the employee access
     * @return String message
     */
    @GetMapping("/testEmp")
    //@PreAuthorize("hasRole('EMPLOYEE')")
    public String empAccess() {
        return "Must be employee to see this";
    }

}
