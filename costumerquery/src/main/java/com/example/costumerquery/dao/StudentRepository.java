package com.example.costumerquery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.costumerquery.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    
    @Query(value = "select * from student where active = :active", nativeQuery = true)
    public List<Student> getStudents(boolean active);


    @Query(value = "select * from student where age = :age", nativeQuery = true)
    public List<Student> findStudentsByAge(Integer age);

    @Query(value = "select * from student where first_name = :firstName", nativeQuery = true)
    public List<Student> findStudentsByFirstname(String firstName);

    @Query(value = "select * from student where last_name = :lastName", nativeQuery = true)
    public List<Student> findStudentsByLastName(String lastName);
}
