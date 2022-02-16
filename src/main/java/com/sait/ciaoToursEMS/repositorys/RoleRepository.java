package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.EnumRoles;
import com.sait.ciaoToursEMS.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(EnumRoles name);

}
