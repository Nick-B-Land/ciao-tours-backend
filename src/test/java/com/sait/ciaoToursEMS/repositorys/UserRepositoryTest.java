package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.EmployeeType;
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
}