package com.springdemo.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bookservice {

	@Autowired 
	private BookRepo bookrepo;
	
	
	//List<Book> books=new ArrayList<> (Arrays.asList(new Book("abc","Ham","burguer"),new Book("abc","Ham","burguer")));
	
	public List<Book> getALLbook()
	{
		//return books;
		List<Book> books=new ArrayList<>();
		
		bookrepo.findAll().forEach(books :: add);
		return books;
	}
	
	public Book getbookwithid(String id)
	{
	
        return bookrepo.findById(id).get();
		
		//return books.stream().filter(t -> t.getID().equals(id)).findFirst().get();
	}

	public void addbook(Book book) {
		
		System.out.print("swapnilkkk");
		bookrepo.save(book);
		}
	public void updatebook(String id, Book book)
	{
		bookrepo.save(book);
	}
	
	public void deletebook(String id)
	{
		bookrepo.deleteById(id);
	}
	
	
}
