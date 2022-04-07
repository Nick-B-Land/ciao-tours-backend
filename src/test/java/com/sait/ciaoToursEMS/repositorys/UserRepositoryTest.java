package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.EmployeeType;
import com.sait.ciaoToursEMS.model.EnumEmployeeTypes;
import com.sait.ciaoToursEMS.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.transaction.Transactional;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        User user = new User("admin","admin");
        Employee employee = new Employee(new HashSet<>(), "Duncan", "Bain", "12345 avenue ne", "calgary", "email@emial.com", new Date(), new Date(), 21F, 1500F, 1234L, 1234L, 12345L);
        user.setEmployee(employee);
        userRepository.save(user);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void findByUsername() {
        userRepository.findByUsername("admin").ifPresent(user -> assertEquals("admin", user.getUsername()));
    }

    @Test
    void existsByUsername() {
        boolean actual = userRepository.existsByUsername("admin");
        assertTrue(actual);
    }

    @Test
    void setUserEmployee(){
        String expected = "Dinko";
        userRepository.findByUsername("admin").ifPresent(user -> {
            Employee employee = new Employee(new HashSet<>(), "Dinko", "bing", "12345 avenue ne", "calgary", "email@emial.com", new Date(), new Date(), 21F, 1500F, 1234L, 1234L, 12345L);
            user.setEmployee(employee);
            userRepository.save(user);
        });
        userRepository.findByUsername("admin").ifPresent(user -> {
            System.out.println(user.getEmployee().getEmployeeId());
            assertEquals(expected, user.getEmployee().getFirstName());
        });
    }
    //Test assigning the full time employeeType to the users employee
    @Test
    void setUserEmployeeType() {

        EnumEmployeeTypes expected = EnumEmployeeTypes.FULL_TIME;

        userRepository.findByUsername("admin").ifPresent(user -> {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setDescription(EnumEmployeeTypes.FULL_TIME);
            user.getEmployee().setEmployeeType(employeeType);
            System.out.println(user.getEmployee().getEmployeeType().getDescription());
            System.out.println(user.getEmployee().getEmployeeId());
            userRepository.save(user);
        });

        assertEquals(expected, userRepository.findByUsername("admin").get().getEmployee().getEmployeeType().getDescription());
    }

    //Test assigning the full time employeeType to the users employee
    @Test
    void setUserEmployeeTypeThroughEmployeeRepo() {
        long empid = userRepository.findByUsername("admin").get().getEmployee().getEmployeeId();
        EnumEmployeeTypes expected = EnumEmployeeTypes.FULL_TIME;

        employeeRepository.findById(empid).ifPresent(employee -> {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setDescription(EnumEmployeeTypes.FULL_TIME);
            employee.setEmployeeType(employeeType);
            employeeRepository.save(employee);
        });

        assertEquals(expected, employeeRepository.findById(empid).get().getEmployeeType().getDescription());
    }

}