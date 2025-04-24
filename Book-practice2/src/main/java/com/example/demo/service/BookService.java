package com.example.demo.service;



import java.util.List;

//import org.springframework.stereotype.Service;

import com.example.demo.dto.Bookdto;

//@Service
public interface BookService {
	 List<Bookdto> getAllBooks();
Bookdto getbybookname(String name);
}
