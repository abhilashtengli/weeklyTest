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
@Table(name ="pro_tbl")
public class ProductModel {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name ="pro_id")
    private Integer pId;
    private String pname;
    private String pprice;
    private String pdescription;
    private String pcategory;
    private String pbrand;
}
