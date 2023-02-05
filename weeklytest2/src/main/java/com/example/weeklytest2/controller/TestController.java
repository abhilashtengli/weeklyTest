package com.example.weeklytest2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.weeklytest2.model.TestModel;
import com.example.weeklytest2.service.TestService;

@RestController
@RequestMapping("/api/mainResto")
public class TestController {
    @Autowired
    TestService service;

    @GetMapping("/show")
    public List<TestModel> getAll() {
        return service.getResturant();
    }

    @PostMapping("/updateResto")
    public void addResto(@RequestBody TestModel testModel){
        service.addResto(testModel);
    }

    @GetMapping("/searchByName/ResturantName/{name}")
    public  TestModel findByName(@PathVariable String name){
        return service.findByName(name);
    }

}
