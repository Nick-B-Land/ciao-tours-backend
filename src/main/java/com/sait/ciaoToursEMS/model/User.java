package com.sait.ciaoToursEMS.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotNull
    private Long employeeID;

    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User() {}

    public User(@NotBlank String username, @NotBlank String password, @NotBlank Long employee_id) {
        this.username = username;
        this.password = password;
        this.employeeID = employee_id;
    }

    public User(@NotBlank String username, @NotBlank String password, @NotBlank Long employee_id, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.employeeID = employee_id;
        this.roles = roles;
    }

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEmployee_id() {
        return employeeID;
    }

    public void setEmployee_id(Long employee_id) {
        this.employeeID = employee_id;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
