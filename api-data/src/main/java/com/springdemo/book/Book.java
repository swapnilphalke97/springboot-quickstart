package com.springdemo.book;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Service;


@Entity
public class Book {

	public Book()
	{
		
	}
	
	
public Book(String iD2, String name2, String description2) {
	super();
	ID = iD2;
	this.name = name2;
	this.description = description2;
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
