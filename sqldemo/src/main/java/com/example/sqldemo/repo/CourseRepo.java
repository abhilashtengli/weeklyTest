package com.example.sqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sqldemo.model.Course;

public interface CourseRepo extends JpaRepository<Course,Integer> {
    
}
