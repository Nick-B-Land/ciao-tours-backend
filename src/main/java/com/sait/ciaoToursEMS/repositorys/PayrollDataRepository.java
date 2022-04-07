package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Payroll;
import com.sait.ciaoToursEMS.model.PayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PayrollDataRepository extends JpaRepository<PayrollData, Long> {

    List<PayrollData> findByPayroll(Payroll p);

}