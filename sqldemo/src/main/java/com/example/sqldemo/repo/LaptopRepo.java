package com.example.sqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sqldemo.model.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
    
}
