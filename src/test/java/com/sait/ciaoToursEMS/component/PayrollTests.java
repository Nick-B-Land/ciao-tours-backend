package com.sait.ciaoToursEMS.component;

import com.sait.ciaoToursEMS.model.*;
import com.sait.ciaoToursEMS.repositorys.EmployeeRepository;
import com.sait.ciaoToursEMS.repositorys.PayrollRepository;
import com.sait.ciaoToursEMS.repositorys.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PayrollTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PayrollRepository payrollRepository;

    @BeforeEach
    void setUp() {
        User user = new User("admin","admin");
        Employee employee = new Employee(new HashSet<>(), "Duncan", "Bain", "12345 avenue ne", "calgary", "email@emial.com", new Date(), new Date(), 21F, 1500F, 1234L, 1234L, 12345L);

        Payroll payroll1 = new Payroll(employee, new Date());
        Payroll payroll2 = new Payroll(employee, new Date());

        PayrollData pd1 = new PayrollData();
        PayrollData pd2 = new PayrollData();

        payroll1.addPayrollData(pd1);
        pd1.setPayroll(payroll1);
        payrollRepository.save(payroll1);
        payroll2.addPayrollData(pd2);
        pd2.setPayroll(payroll2);
        payrollRepository.save(payroll2);

        employee.addPayroll(payroll1);
        employee.addPayroll(payroll2);

        user.setEmployee(employee);

        userRepository.save(user);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getPayrolls() {
        long id = userRepository.findByUsername("admin").get().getEmployee().getEmployeeId();
        employeeRepository.findById(id).ifPresent(emp -> {
            emp.getPayrolls().forEach(payroll -> {
                System.out.println(payroll);
            });

            assertEquals(2, emp.getPayrolls().size());
        });
    }

    //Update payroll
    @Test
    void updatePayroll() {
        long id = userRepository.findByUsername("admin").get().getEmployee().getEmployeeId();
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.findById(id).ifPresent(emp -> {
               emp.getPayrolls().iterator().next().setIsProcessed(1);
               employeeRepository.save(emp);
            });

        assertEquals(1, payrollRepository.findByEmployee(employee).get(0).getIsProcessed());
    }

    //get payroll data
    @Test
    void getPayrollData() {
        long id = userRepository.findByUsername("admin").get().getEmployee().getEmployeeId();
        employeeRepository.findById(id).ifPresent(emp -> {
            assertEquals(1, emp.getPayrolls().iterator().next().getPayrollDatas().size());
        });
    }

}