package com.springdemo.chapters;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Service;

import com.springdemo.book.*;


@Entity
public class Chapter {

	public Chapter()
	{
		
	}
	
	@ManyToOne
	private Book book;
	
public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
public Chapter(String iD2, String name2, String description2) {
	super();
	ID = iD2;
	this.name = name2;
	this.description = description2;
	// TODO Auto-generated constructor stub
}
public Chapter(String iD2, String name2, String description2,String id1) {
	super();
	ID = iD2;
	this.name = name2;
	this.description = description2;
	book= new Book(id1,"","");
	// TODO Auto-generated constructor stub
}


public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
@Id
private String ID;


private String name;
private String description;


}
