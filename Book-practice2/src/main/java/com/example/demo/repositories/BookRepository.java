package com.example.demo.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>  {
	 Optional<Book> findByname(String name);
}
