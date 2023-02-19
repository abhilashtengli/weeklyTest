package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dao.ProductRepo;
import com.example.ecommerce.model.ProductModel;
@Service
public class ProductService {

    @Autowired
    ProductRepo pRepo;

    public void createProduct(ProductModel product) {
        pRepo.save(product);
    }

    public List<ProductModel> getAllProduct() {
        return pRepo.findAll();
    }

    public ProductModel getProductById(Integer pId) {
        return pRepo.findById(pId).get();
    }

    public void deleteProduct(Integer pid) {
        pRepo.deleteById(pid);
    }
    
}
