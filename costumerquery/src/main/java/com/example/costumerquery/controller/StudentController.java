package com.example.costumerquery.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.costumerquery.model.Student;
import com.example.costumerquery.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-Students")
    public ResponseEntity<String> addStudents(@RequestBody String requestData) {
        JSONObject json = new JSONObject(requestData);
        Student student = setStudent(json);
        studentService.addStudents(student);
        return new ResponseEntity<>("Student Details Saved", HttpStatus.CREATED);
    }

    private Student setStudent(JSONObject json) {

        Student newStudent = new Student();
        newStudent.setFirstName(json.getString("firstName"));
        newStudent.setLastName(json.getString("lastName"));
        newStudent.setAge(json.getInt("age"));
        newStudent.setActive(json.getBoolean("active"));
        return newStudent;
    }

    @GetMapping("/get-Students/active/{active}")
    public ResponseEntity<List<Student>> getStudents(@PathVariable boolean active) {
        List<Student> student = studentService.getStudents(active);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/get-students-byFirstName/{firstName}")
    public ResponseEntity<List<Student>> getStudentsByFirstName(@PathVariable String firstName) {
        List<Student> list = studentService.getStudentsByFirstName(firstName);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/get-students-byLastName/{lastName}")
    public ResponseEntity<List<Student>> getStudentsByLastName(@PathVariable String lastName) {
        List<Student> list = studentService.getStudentsByLastName(lastName);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/get-students-byAge/{age}")
    public ResponseEntity<List<Student>> getStudentsByAge(@PathVariable Integer age) {
        List<Student> list = studentService.getStudentsByAge(age);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
