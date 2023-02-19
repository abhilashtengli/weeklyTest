package com.example.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ord_tbl")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ord_id")
    private Integer oid;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private userModel user;
    @JoinColumn(name = "pro_id")
    @ManyToOne
    private  ProductModel productId;
    @JoinColumn(name = "add_id")
    @ManyToOne
    private AddressModel addressid;
    private Integer productquantity;
}
