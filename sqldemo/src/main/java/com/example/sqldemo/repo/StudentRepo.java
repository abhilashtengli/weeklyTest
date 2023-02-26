package com.example.sqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sqldemo.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    
}
