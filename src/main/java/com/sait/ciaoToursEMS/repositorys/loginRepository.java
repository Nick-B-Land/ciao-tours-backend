package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface loginRepository extends JpaRepository<login, Long> {
}