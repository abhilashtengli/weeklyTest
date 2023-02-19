package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.userModel;


public interface userRepo extends JpaRepository<userModel,Integer> {
    
}
