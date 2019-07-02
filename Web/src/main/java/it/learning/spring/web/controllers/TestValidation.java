package it.learning.spring.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/validation")
public class TestValidation {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Message test() {
        Message message = new Message();
        message.setMessage("message");

        return message;
    }

    @PostMapping
    public String testValid(@Valid @RequestBody  Message message) {
        return "test";
    }
}
