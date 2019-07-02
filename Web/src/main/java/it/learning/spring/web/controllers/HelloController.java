package it.learning.spring.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HelloController {

    @GetMapping({"/", "/hello"})
    public String hello(
            @RequestParam(value = "name",
                    required = false,
                    defaultValue = "world") String name,
            Model model) {
        model.addAttribute("name", name);

        return "hello";
    }
}
