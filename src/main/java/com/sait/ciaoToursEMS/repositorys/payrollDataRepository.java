package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.payroll;
import com.sait.ciaoToursEMS.model.payroll_data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface payrollDataRepository extends JpaRepository<payroll_data, Long> {
}