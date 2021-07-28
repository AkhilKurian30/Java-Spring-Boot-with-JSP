package com.company.app.controller;

import java.util.List;
import java.util.Optional;

import com.company.app.model.Book;
import com.company.app.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {
    
@Autowired
BookRepository bookRepository;

    @RequestMapping("/book/{id}")
    public String getbooksbyid(Model model ,@PathVariable int id) {
        Optional<Book> book =bookRepository.findById(id);
        book.ifPresent(value->model.addAttribute("book", value));
         //model.addAttribute("book", book);
        return "book";
    }
    @RequestMapping("/books")
    public String getbooksallbooks(Model model) {
        List<Book> books =bookRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }
}
