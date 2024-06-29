package com.example.demo.controller;

import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping

    User createUser(@RequestBody UserCreationRequest userCreationRequest) {
        return userService.createUser(userCreationRequest);
    }

    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser (@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User editUser (@PathVariable("userId") String userId, @RequestBody UserUpdateRequest request) {
        return userService.editUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser (@PathVariable("userId") String userId) {
         userService.deleteUser(userId);
         return "xoa thanh cong";
    }
}
