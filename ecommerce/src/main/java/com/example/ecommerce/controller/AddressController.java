package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.AddressModel;
import com.example.ecommerce.service.AddressService;

@RestController
@RequestMapping("/AddressController")
public class AddressController {
    
    @Autowired
    AddressService service;

    @PostMapping("/CreateAddress")
    public void CreateAddress(@RequestBody AddressModel Address){
        service.CreateAddress(Address);
    }
}
