package com.springSecurity.controller;

import com.springSecurity.dto.PostDto;
import com.springSecurity.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public List<PostDto> getAllPosts(){
        return postService.getAllPost();
    }
    @GetMapping("/{id}")
    public PostDto getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }
    @PostMapping
    public PostDto createPost(@PathVariable PostDto postDto){
        return postService.createPost(postDto);
    }
}
