package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int PublicationYear;
private String Authorname;
private String Description;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPublicationYear() {
	return PublicationYear;
}
public void setPublicationYear(int publicationYear) {
	PublicationYear = publicationYear;
}
public String getAuthorname() {
	return Authorname;
}
public void setAuthorname(String authorname) {
	Authorname = authorname;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}

//Default constructor is required by JPA
public Book() {}


public Book(int id, String name, int publicationYear, String authorname, String description) {
	super();
	this.id = id;
	this.name = name;
	PublicationYear = publicationYear;
	Authorname = authorname;
	Description = description;
}



}
