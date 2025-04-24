package com.example.demo.dto;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


public class Bookdto {
	 @NotBlank(message = "Title is mandatory")
	private String Name;
	 @NotBlank(message = "Title is mandatory")
	 @NotNull(message = "Publication Year is mandatory")
	 @Positive(message = "Publication Year must be positive")
	private int PublicationYear;
	 @NotBlank(message = "Title is mandatory")
	private String Authorname;
	 @NotBlank(message = "Title is mandatory")
	private String Description;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	
	
	public Bookdto(String name, int publicationYear, String authorname, String description) {
		this.Name = name;
		this.PublicationYear = publicationYear;
		this.Authorname = authorname;
		this.Description = description;
	}
	
	

	
}
