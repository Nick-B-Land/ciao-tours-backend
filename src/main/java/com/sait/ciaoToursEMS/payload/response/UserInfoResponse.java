package com.sait.ciaoToursEMS.payload.response;

import java.util.List;

public class UserInfoResponse {
    private Long id;
    private String username;
    private Long employeeID;
    private List<String> roles;

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    private String cookie;

    public UserInfoResponse(Long id, String username, Long employeeID, List<String> roles) {
        this.id = id;
        this.username = username;
        this.employeeID = employeeID;
        this.roles = roles;
    }

    public UserInfoResponse(Long id, String username, Long employeeID, List<String> roles, String cookie) {
        this.id = id;
        this.username = username;
        this.employeeID = employeeID;
        this.roles = roles;
        this.cookie = cookie;
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
