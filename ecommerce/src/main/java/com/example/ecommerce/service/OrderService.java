package com.example.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dao.OrderRepo;
import com.example.ecommerce.model.OrderModel;
@Service
public class OrderService {

    @Autowired
    OrderRepo oRepo;

    public void createOrder(OrderModel o) {
        oRepo.save(o);

    }

    public OrderModel getOrderById(Integer oId) {
        return oRepo.findById(oId).get();
    }
    
}
