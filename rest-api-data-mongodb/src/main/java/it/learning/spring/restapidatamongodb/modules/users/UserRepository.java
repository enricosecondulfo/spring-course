package it.learning.spring.restapidatamongodb.modules.users;

import it.learning.spring.restapidatamongodb.modules.users.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
