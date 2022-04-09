package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.PayrollDataEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<PayrollDataEvent, Long> {
}