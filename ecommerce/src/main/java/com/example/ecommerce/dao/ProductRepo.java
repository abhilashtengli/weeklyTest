package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel,Integer> {
    
}
