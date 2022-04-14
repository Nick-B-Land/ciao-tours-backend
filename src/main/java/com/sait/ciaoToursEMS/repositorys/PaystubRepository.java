package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.model.Paystub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * PaystubRepository
 * Used to perform CRUD operations on the Paystub table
 */
public interface PaystubRepository extends JpaRepository<Paystub, Long> {
    /**
     * findByDateOfPaystub - Return paystubs that match a date
     * @param date The date to match
     * @return A list of paystubs that match the date
     */
    List<Paystub> findByDateOfPaystub(Date date);

    /**
     * findByEmployeeId - Return paystubs that match an employee id
     * @param id employee id to match
     * @return A list of paystubs that match the employee id
     */
    List<Paystub> findByEmployeeId(Long id);
}