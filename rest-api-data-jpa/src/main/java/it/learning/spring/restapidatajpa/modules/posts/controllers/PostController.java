package it.learning.spring.restapidatajpa.modules.posts.controllers;

import it.learning.spring.restapidatajpa.modules.posts.domains.Post;
import it.learning.spring.restapidatajpa.modules.posts.repositories.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    private PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAll() {
        List<Post> posts = postRepository.findAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> getById(@PathVariable("id") Long id) {
        return postRepository.findById(id)
                .map(post -> new ResponseEntity<>(post, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Post> add(@RequestBody Post post) {
        Post postSaved = postRepository.save(post);
        return new ResponseEntity<>(postSaved, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Post> update(@RequestBody Post post) {
        Post postUpdated = postRepository.save(post);
        return new ResponseEntity<>(postUpdated, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
       return postRepository.findById(id)
                .map(post -> {
                    postRepository.delete(post);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
