package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Event;
import com.sait.ciaoToursEMS.model.paystub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paystubRepository  extends JpaRepository<paystub, Long> {
}