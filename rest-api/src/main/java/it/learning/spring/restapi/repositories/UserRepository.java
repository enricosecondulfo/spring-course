package it.learning.spring.restapi.repositories;

import it.learning.spring.restapi.models.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private Map<Long, User> users = new HashMap<>();

    public Long index = 0L;

    public Collection<User> getAll() {
        return users.values();
    }

    public User getById(Long id) {
        return users.get(id);
    }

    public void add(User user) {
        user.setId(++index);
        users.put(user.getId(), user);
    }

    public void update(User user) {
        if (users.containsKey(user.getId())) {
            users.put(user.getId(), user);
        }
    }

    public void delete(Long id) {
        users.remove(id);
    }

}
