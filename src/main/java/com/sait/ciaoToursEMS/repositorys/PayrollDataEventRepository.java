package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.PayrollDataEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollDataEventRepository extends JpaRepository<PayrollDataEvent, Long> {
}