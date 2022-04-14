package com.sait.ciaoToursEMS.payload.response;

import java.util.List;

/**
 * UserInfoResponse
 * Used to return the user information to the front end
 */
public class UserInfoResponse {
    private Long id;
    private String username;
    private Long employeeID;
    private List<String> roles;

    /**
     * Get the cookie attached to the user response
     * @return String cookie
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Set the cookie attached to the user response
     * @param cookie String cookie
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    /**
     * Cookie attached to the user response
     */
    private String cookie;

    /**
     * Set the roles attached to the user response
     * @param id Long user ID
     * @param username String username
     * @param employeeID Long employeeID
     * @param roles List<String> roles
     */
    public UserInfoResponse(Long id, String username, Long employeeID, List<String> roles) {
        this.id = id;
        this.username = username;
        this.employeeID = employeeID;
        this.roles = roles;
    }

    /**
     * Set the roles attached to the user response
     * @param id Long user ID
     * @param username String username
     * @param employeeID Long employeeID
     * @param roles List<String> roles
     * @param cookie String cookie
     */
    public UserInfoResponse(Long id, String username, Long employeeID, List<String> roles, String cookie) {
        this.id = id;
        this.username = username;
        this.employeeID = employeeID;
        this.roles = roles;
        this.cookie = cookie;
    }

    /**
     * Get the user ID
     * @return Long user ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the user ID
     * @param id Long user ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the employee id
     * @return employee id
     */
    public Long getEmployeeID() {
        return employeeID;
    }

    /**
     * Set the employee id
     * @param employeeID employee id
     */
    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Get the username
     * @return String username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the username
     * @param username String username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the roles
     * @return List<String> roles
     */
    public List<String> getRoles() {
        return roles;
    }
}
