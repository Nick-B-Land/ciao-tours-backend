package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.Employee_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<Employee_type, Long> {

}