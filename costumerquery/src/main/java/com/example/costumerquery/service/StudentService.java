package com.example.costumerquery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.costumerquery.dao.StudentRepository;
import com.example.costumerquery.model.Student;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudents(Student requestData) {
        studentRepository.save(requestData);
    }

    public List<Student> getStudents(boolean active) {
        List<Student> std = studentRepository.getStudents(active);
        return std;
    }

    public List<Student> getStudentsByFirstName(String firstName) {
        return studentRepository.findStudentsByFirstname(firstName);
    }

    public List<Student> getStudentsByLastName(String lastName) {
        return studentRepository.findStudentsByLastName(lastName);
    }

    public List<Student> getStudentsByAge(Integer age) {
        List<Student> std;
         std = studentRepository.findStudentsByAge(age);
            return std;
       
    }
}
