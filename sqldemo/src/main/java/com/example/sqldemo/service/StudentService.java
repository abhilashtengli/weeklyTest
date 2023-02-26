package com.example.sqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqldemo.model.Student;
import com.example.sqldemo.repo.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public void addStudent(Student student) {
        // Student newStudent = new Student();
        // newStudent.setId(student.getId());
        // newStudent.setAddress(student.getAddress());
        // newStudent.setAge(student.getAge());
        // newStudent.setBranch(student.getBranch());
        // newStudent.setDepartment(student.getDepartment());
        // newStudent.setName(student.getName());
        // newStudent.setPhoneNumber(student.getPhoneNumber());
        repo.save(student);
    }

    public void deleteStudentById(Integer id) {
        repo.deleteById(id);;
    }

    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    public Student getStudentById(Integer id) {
        return repo.findById(id).get();
    }

}
