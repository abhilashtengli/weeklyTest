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

import com.example.sqldemo.model.book;
import com.example.sqldemo.repo.StudentRepo;
import com.example.sqldemo.service.bookService;

@RestController
public class bookController {

    @Autowired
    bookService service;

    @Autowired
    StudentRepo repo;

    @PostMapping("post/book")
    public String addBook(@RequestBody String noteBook) {
        JSONObject json = new JSONObject(noteBook);
        book bk = setBook(json);
        service.addBook(bk);
        return "Book details saved";
    }

    private book setBook(JSONObject json) {
        book bk1 = new book();
        bk1.setAuthor(json.getString("author"));
        bk1.setDescription(json.getString("description"));
        bk1.setPrice(json.getInt("price"));
        bk1.setTitle(json.getString("Title"));

        String stuid = json.getString("studentId");
        bk1.setStudent(repo.findById(Integer.valueOf(stuid)).get());
        return bk1;
    }

    @DeleteMapping("/delete/BookId/{Id}")
    public String deleteBookById(@PathVariable Integer Id) {
        service.deleteBookById(Id);
        return "book deleted";
    }

    @GetMapping("/get/Book")
    public List<book> getAllBook() {
        return service.getAllBook();
    }

    @GetMapping("/get/BookId/{Id}")
    public book getBookById(@PathVariable Integer Id) {
        return service.getBookById(Id);
    }

}
