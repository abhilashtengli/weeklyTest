package com.example.weeklytest2.service;

import java.util.ArrayList;
import java.util.List;
// import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.weeklytest2.model.TestModel;
@Service
public class TestService {
    
    private static List<TestModel> models = new ArrayList<>();
    
    // private static int resturantCount = 0;

    static{
        models.add(new TestModel("1","Resturant-1","4.0","Bengaluru"));
        models.add(new TestModel("2","Resturant-2","5.0","Hyderabad"));
        models.add(new TestModel("3","Resturant-3","4.0","Chennai"));
        models.add(new TestModel("4","Resturant-4","5.0","kochi"));
    }

    public List<TestModel> getResturant() {
        return models;
    }

    public void addResto(TestModel testModel) {
        models.add(testModel);
    }

    public TestModel findByName(String name) {
        return models.stream().filter(t -> t.getResturantName().equals(name)).findFirst().get();
    }

}
