package com.example.sqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqldemo.model.Course;
import com.example.sqldemo.repo.CourseRepo;

@Service
public class CourseService {

    @Autowired
    CourseRepo repo;

    public void addCourse(Course course) {
        repo.save(course);
    }

    public void deleteCourseById(Integer id) {
        repo.deleteById(id);
    }

    public List<Course> getAllCourse() {
        return repo.findAll();
    }

    public Course getCourseById(Integer id) {
        return repo.findById(id).get();
    }
    
}
