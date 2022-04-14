package com.sait.ciaoToursEMS.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public class SignupRequest {
    /**
     * The username of the new user
     */
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    /**
     * The employee id of the new user
     */
    @NotNull
    private Long employeeID;

    /**
     * The roles to be assigned to the new user
     */
    private Set<String> roles;

    /**
     * The password of the new user
     */
    @NotBlank
    @Size(min = 1, max = 40)
    private String password;

    /**
     * Get the username of the new user
     * @return  the username of the new user
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the username of the new user
     * @param username the username of the new user
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the employee id of the new user
     * @return  the employee id of the new user
     */
    public Long getEmployeeID() {
        return employeeID;
    }

    /**
     * Set the employee id of the new user
     * @param employeeID the employee id of the new user
     */
    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }


    /**
     * Get the password of the new user
     * @return the password of the new user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of the new user
     * @param password the password of the new user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get the roles to be assigned to the new user
     * @return roles to be assigned to the new user
     */
    public Set<String> getRole() {
        return this.roles;
    }

    /**
     * Set the roles to be assigned to the new user
     * @param role the roles to be assigned to the new user
     */
    public void setRole(Set<String> role) {
        this.roles = role;
    }
}
