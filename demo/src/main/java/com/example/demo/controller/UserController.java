package com.example.demo.controller;

import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/users")

    User createUser(@RequestBody UserCreationRequest userCreationRequest) {
        return userService.createUser(userCreationRequest);
    }
}
