package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EmployeeRepository
 * Used to access employee data from the database
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /**
     * Finds all employees by employee id.
     * @param id employee id
     * @return List of employees with the given id
     */
    List<Employee> findByEmployeeId(Long id);

}
