package it.learning.spring.web.controllers;

import javax.validation.constraints.NotEmpty;

public class Message {

    @NotEmpty
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
