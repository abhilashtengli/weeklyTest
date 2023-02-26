package com.example.sqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqldemo.model.book;
import com.example.sqldemo.repo.bookRepo;

@Service
public class bookService {
    @Autowired
    bookRepo repo;

    public void addBook(book noteBook) {
        repo.save(noteBook);
    }

    public void deleteBookById(Integer id) {
        repo.deleteById(id);
    }

    public List<book> getAllBook() {
        return repo.findAll();
    }

    public book getBookById(Integer id) {
        return repo.findById(id).get();
    }
    
}
