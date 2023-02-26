package com.example.sqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sqldemo.model.book;

public interface bookRepo extends JpaRepository<book,Integer> {
    
}
