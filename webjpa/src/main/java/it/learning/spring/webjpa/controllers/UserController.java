package it.learning.spring.webjpa.controllers;

import it.learning.spring.webjpa.repositories.UserRepository;
import it.learning.spring.webjpa.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Collection<User> getAll() {
        return userRepository.getAll();
    }

    @GetMapping(value = "/{id}")
    public User getById(@PathVariable Long id) {
        return userRepository.getById(id);
    }

    @GetMapping(value = "/firstname/{firstName}")
    public User getByFirstName(@PathVariable String firstName) {
        return userRepository.getByFirstname(firstName);
    }

    @PostMapping
    public void add(@RequestBody User user) {
        userRepository.add(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userRepository.update(user);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.delete(id);
    }
}
