package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.userModel;
import com.example.ecommerce.service.userService;

@RestController
@RequestMapping("/UserController")
public class userController {

    @Autowired
    userService service;

    @PostMapping("/CreateUser")
    public void CreateUser(@RequestBody userModel user) {
        service.CreateUser(user);
    }

    @GetMapping("getAllUser")
    public List<userModel> getAllUser() {
        return service.getAllUser();
    }

    @GetMapping("getUserById/userId/{userId}")
    public userModel getUserById(@PathVariable Integer userId) {
        return service.getUserById(userId);
    }
}
