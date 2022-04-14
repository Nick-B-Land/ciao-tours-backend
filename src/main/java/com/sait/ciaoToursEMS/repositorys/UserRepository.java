package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Employee;
import com.sait.ciaoToursEMS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * UserRepository
 * A repository that handles crud operations on the User table
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * findByEmployeeId - Finds a user by their employee id
     * @param id Employee id
     * @return A list of users that match the employee id
     */
    List<User> findByEmployeeID(Long id);

    /**
     * findByUsername - Finds a user by their username
     * @param username Username
     * @return An optional list of users that match the username
     */
    Optional<User> findByUsername(String username);

    /**
     * existsByUsername - Checks if a user exists by their username
     * @param username Username
     * @return True if the user exists, false if not
     */
    Boolean existsByUsername(String username);
}
