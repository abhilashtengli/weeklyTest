package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.AddressModel;

public interface AddressRepo extends JpaRepository<AddressModel,Integer> {
    
    
}
