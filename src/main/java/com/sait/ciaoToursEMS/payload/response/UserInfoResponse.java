package com.sait.ciaoToursEMS.payload.response;

import java.util.List;

public class UserInfoResponse {
    private Long id;
    private String username;
    private Long employeeID;
    private List<String> roles;

    public UserInfoResponse(Long id, String username, Long employeeID, List<String> roles) {
        this.id = id;
        this.username = username;
        this.employeeID = employeeID;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
