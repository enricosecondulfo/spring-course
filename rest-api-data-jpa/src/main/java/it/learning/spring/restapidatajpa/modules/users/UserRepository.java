package it.learning.spring.restapidatajpa.modules.users;

import it.learning.spring.restapidatajpa.modules.users.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
