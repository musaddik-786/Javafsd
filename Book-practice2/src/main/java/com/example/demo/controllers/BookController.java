package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Bookdto;
import com.example.demo.service.BookService;
import com.example.demo.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/books")
@Validated
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {
	  @Autowired
	    private BookService bookService;
	  
	  @GetMapping
	    public List<Bookdto> getAllBooks() {
	        return bookService.getAllBooks();
	    }
	  
	  @GetMapping("/{name}")
	    public ResponseEntity<Bookdto> getBookByIsbn(@PathVariable String isbn) {
	        try {
	            Bookdto bookDTO = bookService.getbybookname(isbn);
	            return ResponseEntity.ok(bookDTO);
	        } catch (ResourceNotFoundException ex) {
	            return ResponseEntity.notFound().build();
	        }
	    }

}
