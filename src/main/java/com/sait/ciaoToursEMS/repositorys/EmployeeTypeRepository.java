package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EmployeeTypeRepository
 * Used to perform CRUD operations on the EmployeeType table
 */
@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Long> {
}