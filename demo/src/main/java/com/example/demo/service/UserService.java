package com.example.demo.service;

import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request) {
        User user = new User();
        user.setUserName(request.getUserName());
        user.setPassWord(request.getPassWord());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setBithDay(request.getBithDay());

        return userRepository.save(user);
    }

    public List<User> getUsers () {
        return userRepository.findAll();
    }

    public  User getUser (String id) {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
    }

    public  User editUser (String id, UserUpdateRequest request) {
        User user = getUser(id);
        user.setBithDay(request.getBithDay());
        user.setPassWord(request.getPassWord());
        user.setLastName(request.getLastName());
        user.setFirstName(request.getFirstName());

        return userRepository.save(user);
    }

    public void deleteUser (String id) {
        userRepository.deleteById(id);
    }
}
