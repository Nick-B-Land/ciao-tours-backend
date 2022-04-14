package com.sait.ciaoToursEMS.payload.request;

import javax.validation.constraints.NotBlank;

/**
 * LoginRequest.java - This class is used to pass the user credentials to the login endpoint.
 */
public class LoginRequest {
    /**
     * The username of the user.
     */
    @NotBlank
    private String username;

    /**
     * The password of the user.
     */
    @NotBlank
    private String password;

    /**
     * Getter for the username.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for the username.
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for the password.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for the password.
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
