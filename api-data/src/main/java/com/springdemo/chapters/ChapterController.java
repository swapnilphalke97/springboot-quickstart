package com.springdemo.chapters;

import java.util.List;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springdemo.book.Book;
@RestController
public class ChapterController {

	@Autowired
	private Chapterservice chapterservice;
	
	
	
	@RequestMapping("book/{id}/chapter")
	public List<Chapter> getallchapter(@PathVariable String id)
	{
		return chapterservice.getALLchapter(id);
	}
	
	@RequestMapping("/book/{id}/course/{id1}")
	public Chapter getcoursewithid(@PathVariable String id,@PathVariable String id1)
	{
		
		return chapterservice.getcoursewithid(id,id1);
	}
	
	//when post request came , come here
	 @RequestMapping(method=RequestMethod.POST, value="/book/{id}/chapter")
	public void addchapter(@RequestBody Chapter chapter,@PathVariable String id)
	{
		
		chapter.setBook(new Book(id,"",""));
		 chapterservice.addchapter(chapter);
	}
	 
	 
	 @RequestMapping(method=RequestMethod.PUT, value="/book/{id1}/chapter/{id}")
	 public void updatechapter(@PathVariable String id,@RequestBody Chapter book)
		{
			
		 chapterservice.updatebook(id, book);
		}
	 
	 @RequestMapping(method=RequestMethod.DELETE, value="/book/{id}/chapter/{id1}") 
	 public void delete(@PathVariable String id1)
		{
			
		 chapterservice.deletebook(id1);
		}
		 
	 
	
}
