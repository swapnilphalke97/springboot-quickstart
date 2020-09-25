package com.springdemo.book;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private Bookservice bookservice;
	
	
	
	@RequestMapping("book")
	public List<Book> getbook()
	{
		return bookservice.getALLbook();
	}
	
	@RequestMapping("/book/{id}")
	public Book getbookwithid(@PathVariable String id)
	{
		
		return bookservice.getbookwithid(id);
	}
	
	//when post request came , come here
	 @RequestMapping(method=RequestMethod.POST, value="/book")
	public void addbook(@RequestBody Book book)
	{
		
		 bookservice.addbook(book);
	}
	 
	 
	 @RequestMapping(method=RequestMethod.PUT, value="/book/{id}")
	 public void update(@PathVariable String id,@RequestBody Book book)
		{
			
			 bookservice.updatebook(id, book);
		}
	 
	 @RequestMapping(method=RequestMethod.DELETE, value="/book/{id}") 
	 public void delete(@PathVariable String id)
		{
			
			 bookservice.deletebook(id);
		}
		 
	 
	
}
