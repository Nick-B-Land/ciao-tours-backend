package com.sait.ciaoToursEMS.services;

import com.sait.ciaoToursEMS.exceptions.ResourceNotFoundException;
import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.EmployeeType;
import com.sait.ciaoToursEMS.repositorys.EmployeeRepository;
import com.sait.ciaoToursEMS.repositorys.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    public Employee createEmployee(Employee employee) {

        EmployeeType et = employee.getEmployeeType();

        if(et != null) {
            // check if employee type exists
            EmployeeType newType = employeeTypeRepository.findById(et.getEmployeeTypeId())
                    .orElseThrow(() -> new ResourceNotFoundException("No employee type found with this id :" + et.getEmployeeTypeId()));
            employee.setEmployeeType(newType);
        }
        else {
            // set employee type to default employee type (99)
            EmployeeType newType = employeeTypeRepository.findById(99L)
                    .orElseThrow(() -> new ResourceNotFoundException("No employee type found with this id :" + 99L));
        }

        return employeeRepository.save(employee);
    }

}
