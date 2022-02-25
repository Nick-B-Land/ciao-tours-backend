package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.PayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayrollDataRepository extends JpaRepository<PayrollData, Long> {
    List <PayrollData> findByPayrollId(Long id);
}