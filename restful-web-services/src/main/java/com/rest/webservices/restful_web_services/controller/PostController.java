package com.rest.webservices.restful_web_services.controller;

import com.rest.webservices.restful_web_services.dao.PostDaoService;
import com.rest.webservices.restful_web_services.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostDaoService postDaoService;

    @GetMapping("/all-post")
    public List<Post> getALlUser(){
        return postDaoService.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Post> getPostById(@PathVariable Integer id){
        return Optional.of(postDaoService.findById(id)).orElse(null);
    }
}
