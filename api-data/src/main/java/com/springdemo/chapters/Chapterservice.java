package com.springdemo.chapters;
import com.springdemo.book.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Chapterservice {

	@Autowired 
	private ChapterRepo chapterrepo;
	
	
	//List<Book> books=new ArrayList<> (Arrays.asList(new Book("abc","Ham","burguer"),new Book("abc","Ham","burguer")));
	
	public List<Chapter> getALLchapter(String id)
	{
		//return books;
		List<Chapter> chapters=new ArrayList<>();
		chapterrepo.findByBookID(id).forEach(chapters :: add);;
        return chapters;
	}
	
	public Chapter getcoursewithid(String id, String id1)
	{
	
        return chapterrepo.findById(id1).get();
		
		//return books.stream().filter(t -> t.getID().equals(id)).findFirst().get();
	}

	public void addchapter(Chapter chapter) {
	     
		chapterrepo.save(chapter);
		
		//Chapter chapter1=chapterrepo.findByBookId(id).get(0);
		
		
		}
	public void updatebook(String id, Chapter chapter)
	{
		chapterrepo.save(chapter);
	}
	
	public void deletebook(String id)
	{
		chapterrepo.deleteById(id);
	}
	
	
}
