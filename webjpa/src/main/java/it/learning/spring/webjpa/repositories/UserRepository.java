package it.learning.spring.webjpa.repositories;

import it.learning.spring.webjpa.exceptions.NotFoundException;
import it.learning.spring.webjpa.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.Collection;

@Transactional
@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Collection<User> getAll() {
        TypedQuery<User> query = entityManager.createQuery("SELECT u from User u", User.class);
        return query.getResultList();
    }

    public User getById(Long id) throws NotFoundException {
        User user = entityManager.find(User.class, id);

        if (user != null) {
            return user;
        } else {
            throw new NotFoundException();
        }
    }

    public User add(User user) {
        entityManager.persist(user);
        return user;
    }

    public User update(User user) {
        return entityManager.merge(user);
    }

    public void delete(Long id) throws NotFoundException {
        User user = entityManager.find(User.class, id);

        if (user != null) {
            entityManager.remove(id);

        } else {
            throw new NotFoundException();
        }
    }
}
