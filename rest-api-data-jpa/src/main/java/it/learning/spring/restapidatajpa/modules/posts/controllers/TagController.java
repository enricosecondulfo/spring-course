package it.learning.spring.restapidatajpa.modules.posts.controllers;

import it.learning.spring.restapidatajpa.modules.posts.domains.Post;
import it.learning.spring.restapidatajpa.modules.posts.domains.Tag;
import it.learning.spring.restapidatajpa.modules.posts.repositories.PostRepository;
import it.learning.spring.restapidatajpa.modules.posts.repositories.TagRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tags")
public class TagController {

    private TagRepository tagRepository;

    public TagController(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @GetMapping
    public ResponseEntity<List<Tag>> getAll() {
        List<Tag> posts = tagRepository.findAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tag> getById(@PathVariable("id") Long id) {
        return tagRepository.findById(id)
                .map(post -> new ResponseEntity<>(post, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Tag> add(@RequestBody Tag tag) {
        Tag postSaved = tagRepository.save(tag);
        return new ResponseEntity<>(postSaved, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Tag> update(@RequestBody Tag post) {
        Tag postUpdated = tagRepository.save(post);
        return new ResponseEntity<>(postUpdated, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
       return tagRepository.findById(id)
                .map(post -> {
                    tagRepository.delete(post);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
