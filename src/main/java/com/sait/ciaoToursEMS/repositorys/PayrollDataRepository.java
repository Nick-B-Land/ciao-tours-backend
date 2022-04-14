package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.PayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * PayrollDataRepository
 * not currently a repository, but a placeholder for future functionality
 */
public interface PayrollDataRepository extends JpaRepository<PayrollData, Long> {
    /**
     * findByEmployeeId - Find payroll data objects by payroll id
     * @param id Payroll id
     * @return list of payroll data
     */
    List <PayrollData> findByPayrollId(Long id);
}