package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.EnumRoles;
import com.sait.ciaoToursEMS.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * RoleRepository
 * used to manage the Role table in the database
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Finds a role by its name.
     * @param name the name of the role.
     * @return an optional role if found
     */
    Optional<Role> findByName(EnumRoles name);

}
