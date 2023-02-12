package com.example.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentModel {
    private int StudentId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    
}
