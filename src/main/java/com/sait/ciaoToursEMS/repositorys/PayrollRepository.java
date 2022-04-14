package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.model.PayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PayrollRepository
 * Used to perform CRUD operations on the Payroll table
 */
@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long> {
    /**
     * finyByEmployeeId - Finds a payroll by employee id
     * @param id employee id
     * @return List of payroll objects that match the employee id
     */
    List<Payroll> findByEmployeeId(Long id);

    /**
     * findByIsProcessed - Finds a payroll by isProcessed field
     * @param status isProcessed field - 1. processed, 0. not processed
     * @return List of payroll objects that match the isProcessed field type
     */
    List<Payroll> findByIsProcessed(int status);
}