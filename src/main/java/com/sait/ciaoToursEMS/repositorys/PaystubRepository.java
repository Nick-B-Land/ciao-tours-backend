package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.model.Paystub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PaystubRepository extends JpaRepository<Paystub, Long> {
    List<Paystub> findByDateOfPaystub(Date date);

    List<Paystub> findByEmployeeId(Long id);
}