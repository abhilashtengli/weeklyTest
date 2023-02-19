package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dao.userRepo;
import com.example.ecommerce.model.userModel;

@Service
public class userService {

    @Autowired
    userRepo uRepo;

    public void CreateUser(userModel user) {
       uRepo.save(user);
    }

    public List<userModel> getAllUser() {
        return uRepo.findAll();
    }

    public userModel getUserById(Integer userId) {
        return  uRepo.findById(userId).get();
    }

    
}
