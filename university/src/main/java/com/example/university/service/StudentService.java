package com.example.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.university.model.StudentModel;

@Service
public class StudentService {
    private static List<StudentModel> students = new ArrayList<>();

    static {
       
        students.add(new StudentModel(1,"Abhi","Tengli",22,"IC"));
        students.add(new StudentModel(2,"Arjun","Tendulkar",19,"BCA"));
        students.add(new StudentModel(3,"Ashok","Nair",20,"CE"));
        students.add(new StudentModel(4,"Siddharth","Patil",18,"EC"));
    }

    public List<StudentModel> getAll() {
        return students;
    }

    public StudentModel findById(int studentId) {
        return students.stream().filter(t-> t.getStudentId()==studentId).findFirst().get();
    }

    public void addStudent(StudentModel newStudent) {
        students.add(newStudent);
    }

    public void deleteStudent(int studentId) {
        StudentModel s = findById(studentId);
        students.remove(s);
    }

    public void updateStudent(int studentId, StudentModel newStudent) {
    
        StudentModel student = findById(studentId);
        student.setDepartment(newStudent.getDepartment());
    }
}