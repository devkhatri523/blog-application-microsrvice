package com.treeleaf.blogservice.web.rest;

import com.treeleaf.blogservice.model.Comment;
import com.treeleaf.blogservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/blog")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/posts/{postid}/comments")
    private List<Comment> getAllComments(@PathVariable("postid") int postid){
        return commentService.getAllCommentsByPostId(postid);
    }

    @PostMapping("/posts/{postid}/comments")
    private Comment saveComment(@RequestBody Comment comment, @PathVariable("postid") int postid){
        commentService.save(comment, postid);
        return comment;
    }

    @PutMapping("/posts/{postid}/comments{commentid}")
    private String updateComment(@RequestBody Comment comment, @PathVariable("postid") int postid){
        commentService.update(comment, postid);
        return "Comment with id " + postid + " updated";
    }

    @DeleteMapping("/posts/{postid}/comments/{commentid}")
    private String deleteComment(@PathVariable("postid") int postid){
        commentService.delete(postid);
        return "Comment with id " + postid + " deleted";
    }

}
