package it.learning.spring.boottools.users.repositories;

import it.learning.spring.boottools.users.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@ConditionalOnProperty(
        name = "persistence.enablejpa",
        havingValue = "true")
public class JpaUserRepository implements UserRepository {

    @Override
    public List<User> getAll() {
        System.out.println("jpa");

        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
