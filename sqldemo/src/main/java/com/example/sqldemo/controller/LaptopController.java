package com.example.sqldemo.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sqldemo.model.Laptop;
import com.example.sqldemo.repo.StudentRepo;
import com.example.sqldemo.service.LaptopService;

@RestController
public class LaptopController {

    @Autowired
    LaptopService service;

    @Autowired
    StudentRepo repo;

    @PostMapping("post/laptop")
    public String addLaptop(@RequestBody String laptop) {
        JSONObject json = new JSONObject(laptop);
        Laptop lap = setLaptop(json);
        service.addLaptop(lap);
        return "saved laptop";
    }

    private Laptop setLaptop(JSONObject json) {
        Laptop lap = new Laptop();
        lap.setBrand(json.getString("brand"));
        lap.setName(json.getString("name"));
        lap.setPrice(json.getInt("price"));

        Integer stuid = json.getInt("studentId");
        lap.setStudent(repo.findById(stuid).get());
        return lap;
    }

    @GetMapping("get/laptop/all")
    public List<Laptop> getAll() {
        return service.getAll();
    }

    @GetMapping("Get/LaptopById/{Id}")
    public Laptop getById(@PathVariable Integer Id) {
        return service.getById(Id);
    }

    @DeleteMapping("/delete/LaptopId/{Id}")
    public String deleteLapById(@PathVariable Integer Id) {
        service.deleteLapById(Id);
        return "Laptop details deleted";
    }
}
