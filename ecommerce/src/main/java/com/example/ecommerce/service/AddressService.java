package com.example.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dao.AddressRepo;
import com.example.ecommerce.model.AddressModel;

@Service
public class AddressService {

    @Autowired
    AddressRepo aRepo;
    public void CreateAddress(AddressModel Address) {
     aRepo.save(Address);
    }
    
}
