package com.sait.ciaoToursEMS.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * User class
 * This is what the user will be represented as in the database
 * Includes login information and the user's role.
 */
@Entity
@Table(name="users")
public class User {

    /**
     * User ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    /**
     * Account username
     */
    @NotBlank
    private String username;

    /**
     * Account password
     */
    @NotBlank
    private String password;

    /**
     * Employee Id associated with the user
     */
    @NotNull
    private Long employeeID;

    /**
     * User role (admin, manager, employee)
     */
    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User() {}

    /**
     * Constructor for User
     * @param username Account username
     * @param password Account password
     * @param employee_id Employee Id associated with the user
     */
    public User(@NotBlank String username, @NotBlank String password, @NotBlank Long employee_id) {
        this.username = username;
        this.password = password;
        this.employeeID = employee_id;
    }

    /**
     * Constructor for User
     * @param username Account username
     * @param password Account password
     * @param employee_id Employee Id associated with the user
     * @param roles User role(s) (admin, manager, employee)
     */
    public User(@NotBlank String username, @NotBlank String password, @NotBlank Long employee_id, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.employeeID = employee_id;
        this.roles = roles;
    }

    /**
     * Returns the user's ID
     * @return user_id
     */
    public Long getId() {
        return user_id;
    }

    /**
     * Returns the user's username
     * @return username
     */
    public void setId(Long id) {
        this.user_id = id;
    }

    /**
     * Returns the user's username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the user's username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the user's password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the user's employee ID
     * @return employeeID
     */
    public Long getEmployee_id() {
        return employeeID;
    }

    /**
     * Sets the user's employee ID
     * @param employee_id
     */
    public void setEmployee_id(Long employee_id) {
        this.employeeID = employee_id;
    }

    /**
     * Returns the user's roles
     * @return roles
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Sets the user's roles
     * @param roles
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
