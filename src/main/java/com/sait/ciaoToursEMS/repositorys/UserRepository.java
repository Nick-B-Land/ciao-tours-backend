package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmployeeID(Long id);
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);

}
