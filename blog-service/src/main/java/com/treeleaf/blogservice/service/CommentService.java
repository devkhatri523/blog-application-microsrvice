package com.treeleaf.blogservice.service;

import com.treeleaf.blogservice.model.Comment;
import com.treeleaf.blogservice.model.Post;
import com.treeleaf.blogservice.repository.CommentRepository;
import com.treeleaf.blogservice.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostService postService;

    public List<Comment> getAllCommentsByPostId(int postid){
        return commentRepository.findByPostId(postid);
    }

    public Comment getCommentById(int id) {
        return commentRepository.findById(id).get();
    }

    public void save(Comment comment,int postid){
        Post p = postService.getPostById(postid);
        comment.setPost(p);
        commentRepository.save(comment);
    }

    public void delete(int id){
        commentRepository.deleteById(id);
    }

    public void update(Comment comment,int id){
        Comment c = getCommentById(id);
        c.setMessage(comment.getMessage());
        commentRepository.save(c);
    }

}