package com.sait.ciaoToursEMS.exceptions;

public class EntityNotFoundException extends Exception {
    public EntityNotFoundException(Long id) {
        super("Entity with id " + id + " not found");
    }
}
