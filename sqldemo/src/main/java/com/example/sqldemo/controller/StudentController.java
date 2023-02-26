package com.example.sqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sqldemo.model.Student;
import com.example.sqldemo.service.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    StudentService service;

    @PostMapping("post/Student")
    public String addStudent(@RequestBody Student student){
        service.addStudent(student);
        return "student details saved";
    }

    @DeleteMapping("/delete/StudentId/{Id}")
    public String deleteStudentById(@PathVariable Integer Id){
         service.deleteStudentById(Id);
         return "deleted";
    }

    @GetMapping("/get/Student")
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @GetMapping("/get/StudentId/{Id}")
    public Student getStudentById(@PathVariable Integer Id){
        return service.getStudentById(Id);
    }
}
