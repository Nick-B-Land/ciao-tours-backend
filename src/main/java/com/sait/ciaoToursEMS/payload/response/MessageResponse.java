package com.sait.ciaoToursEMS.payload.response;

/**
 * MessageResponse
 * Message response class to return message to the front end
 */
public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
