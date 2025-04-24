package com.example.demo.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.Bookdto;
import com.example.demo.entities.Book;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repositories.BookRepository;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
		@Autowired
		private BookRepository Bookrepos;
	
		 @Override
		    public Bookdto getbybookname(String name) {
		        Book book = Bookrepos.findByname(name)
		                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
		        return new Bookdto(book.getName(), book.getPublicationYear(), book.getAuthorname(), book.getDescription());
		    }
		 
		 @Override
		    public List<Bookdto> getAllBooks() {
		        List<Book> books = Bookrepos.findAll();
		        return books.stream().map(book -> new Bookdto(
		        		book.getName(), book.getPublicationYear(), book.getAuthorname(), book.getDescription())
		        ).collect(Collectors.toList());
		    }
	}
	

