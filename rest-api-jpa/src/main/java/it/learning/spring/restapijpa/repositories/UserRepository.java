package it.learning.spring.restapijpa.repositories;

import it.learning.spring.restapijpa.exceptions.NotFoundException;
import it.learning.spring.restapijpa.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

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

    public User getByFirstname(String firstName) throws NoResultException {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.firstName = :firstName", User.class);
        query.setParameter("firstName", firstName);

       List<User> users = query.getResultList();

       if (users.size() > 0) {
           return users.get(0);
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
            entityManager.remove(user);

        } else {
            throw new NotFoundException();
        }
    }
}
