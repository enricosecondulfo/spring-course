package it.learning.spring.restapidatajpa.modules.posts.controllers;


import it.learning.spring.restapidatajpa.modules.posts.domains.Comment;
import it.learning.spring.restapidatajpa.modules.posts.repositories.CommentRepository;
import it.learning.spring.restapidatajpa.modules.posts.repositories.PostRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/posts/{postId}/comments")
public class CommentController {

    private CommentRepository commentRepository;

    private PostRepository postRepository;

    public CommentController(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @GetMapping
    public ResponseEntity<List<Comment>> getAllByPost(@PathVariable Long postId) {
        return this.postRepository.findById(postId)
                .map(post -> {
                    List<Comment> comments = this.commentRepository.findByPostId(postId);
                    return ResponseEntity.ok(comments);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Comment> add(@PathVariable Long postId, @RequestBody Comment comment) {
        return this.postRepository.findById(postId)
                .map(post -> {
                    comment.setPost(post);
                    Comment commentSaved = commentRepository.save(comment);
                    return ResponseEntity.ok(commentSaved);
                }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{commentId}")
    public ResponseEntity<?> update(@PathVariable Long postId, @PathVariable Long commentId, @RequestBody Comment comment) {
        if (!this.postRepository.existsById(postId)) {
            ResponseEntity.notFound().build();
        }

        return this.commentRepository.findById(commentId)
                .map(commentFound -> {
                    commentFound.setText(comment.getText());
                    Comment commentUpdated = this.commentRepository.save(commentFound);
                    return ResponseEntity.ok(commentUpdated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

   /*  @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<?> delete(@PathVariable Long postId, @PathVariable Long commentId) {
        return this.commentRepository.findByIdAndPostId(commentId, postId)
              .map(comment -> {
                  this.commentRepository.delete(comment);
                  return ResponseEntity.ok().build();
              }).orElse(ResponseEntity.notFound().build());

    } */
}
