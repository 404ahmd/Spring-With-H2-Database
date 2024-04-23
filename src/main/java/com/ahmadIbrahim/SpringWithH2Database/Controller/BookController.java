package com.ahmadIbrahim.SpringWithH2Database.Controller;

import com.ahmadIbrahim.SpringWithH2Database.Entity.Book;
import com.ahmadIbrahim.SpringWithH2Database.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(
            "api/book"
    )
    public Book addBook(@RequestBody Book newBook){
        return bookRepository.save(newBook);
    }

    @GetMapping(
            "api/books"
    )
    public List<Book> listBook(){
        return bookRepository.findAll();
    }

}
