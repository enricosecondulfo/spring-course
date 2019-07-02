package it.learning.spring.web.services;

import it.learning.spring.web.models.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<Long, User> users = new HashMap<>();

    public Long index = 0L;

    public Collection<User> getAll() {
        return users.values();
    }

    public User getById(Long id) {
        return users.get(id);
    }

    public void add(User user) {
        user.setId(index++);
        users.put(user.getId(), user);
    }

    public void update(User user) {
        users.put(user.getId(), user);
    }


    public void delete(Long id) {
        users.remove(id);
    }

}
