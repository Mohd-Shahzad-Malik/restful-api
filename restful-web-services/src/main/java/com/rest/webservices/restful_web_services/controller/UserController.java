package com.rest.webservices.restful_web_services.controller;

import com.rest.webservices.restful_web_services.dao.UserDaoService;
import com.rest.webservices.restful_web_services.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/all-user")
    public List<User> getALlUser(){
        return userDaoService.findAll();
    }
}
