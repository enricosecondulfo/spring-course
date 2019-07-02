package it.learning.spring.web.controllers;

import it.learning.spring.web.extensions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// @ControllerAdvice
public class GlobalHandlerError extends ResponseEntityExceptionHandler {

    /* @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND) */
    public ResponseEntity<String> handleMessage(NotFoundException exception) {
        System.out.println(exception);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found");
    }
}
