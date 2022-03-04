package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Paystub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaystubRepository extends JpaRepository<Paystub, Long> {
}