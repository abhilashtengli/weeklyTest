package com.example.sqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sqldemo.model.Course;
import com.example.sqldemo.service.CourseService;

@RestController
public class CourseController {
    
    @Autowired
    CourseService service;

    @PostMapping("post/Course")
    public String addCourse(@RequestBody Course course){
        service.addCourse(course);
        return "course details saved";
    }

    @DeleteMapping("/delete/CourseId/{Id}")
    public String deleteCourseById(@PathVariable Integer Id){
         service.deleteCourseById(Id);
         return "course deleted";
    }

    @GetMapping("/get/Course")
    public List<Course> getAllCourse(){
        return service.getAllCourse();
    }

    @GetMapping("/get/CourseId/{Id}")
    public Course getCourseById(@PathVariable Integer Id){
        return service.getCourseById(Id);
}

}
