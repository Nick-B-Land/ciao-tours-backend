package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.model.Paystub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface PaystubRepository extends JpaRepository<Paystub, Long> {
    List<Paystub> findByDateOfPaystub(Date date);

    List<Paystub> findByEmployeeId(Long id);
}