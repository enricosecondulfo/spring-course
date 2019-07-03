package it.learning.spring.restapidatajpa.modules.posts.repositories;

import it.learning.spring.restapidatajpa.modules.posts.domains.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
