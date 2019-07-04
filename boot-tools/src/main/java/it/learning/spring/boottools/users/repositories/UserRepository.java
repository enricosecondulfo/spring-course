package it.learning.spring.boottools.users.repositories;

import it.learning.spring.boottools.users.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User getById(Long id);

    void add(User user);

    void update(User user);

    void delete(Long id);
}
