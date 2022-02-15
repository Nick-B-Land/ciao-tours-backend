package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.login;
import com.sait.ciaoToursEMS.model.payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface payrollRepository  extends JpaRepository<payroll, Long> {
}