package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.OrderModel;

public interface OrderRepo extends JpaRepository<OrderModel,Integer> {

}
