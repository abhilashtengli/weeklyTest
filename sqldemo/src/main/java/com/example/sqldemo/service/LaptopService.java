package com.example.sqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqldemo.model.Laptop;
import com.example.sqldemo.repo.LaptopRepo;

@Service
public class LaptopService {
    @Autowired
    LaptopRepo repo;

    public void addLaptop(Laptop laptop) {
        repo.save(laptop);
    }

    public List<Laptop> getAll() {
        return repo.findAll();
    }

    public Laptop getById(Integer id) {
        return repo.findById(id).get();
    }

    public void deleteLapById(Integer id) {
        repo.deleteById(id);
    }

    
}
