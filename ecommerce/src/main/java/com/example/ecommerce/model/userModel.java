package com.example.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="user_tbl")
public class userModel {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private Integer userId;
    private String name;
    private String email;
    private String password;
    private String phonenumber;
}
