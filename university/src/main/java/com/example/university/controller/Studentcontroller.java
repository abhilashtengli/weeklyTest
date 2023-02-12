package com.example.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.university.model.StudentModel;
import com.example.university.service.StudentService;

@RestController
@RequestMapping("University/Student")
public class Studentcontroller {
    
    @Autowired
    private StudentService studentService;
    
    // ---------------------------------------------
    @GetMapping("getAll")
    public List<StudentModel> getAll(){
        return studentService.getAll();
    }

    @GetMapping("get/StudentById/{StudentId}")
    public StudentModel findByid(@PathVariable int StudentId){
        return studentService.findById(StudentId);
    }

    @PostMapping("add/Student")
    public void addStudent(@RequestBody StudentModel newStudent){
         studentService.addStudent(newStudent);
    }

    @DeleteMapping("delete/studentById/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping("update/studentByid/{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody StudentModel newStudent){
         studentService.updateStudent(studentId,newStudent);
    }

    // ----------------------------------------------
 
}
