package com.springdemo.chapters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ChapterRepo extends CrudRepository<Chapter,String> {

	public List<Chapter> findByBookID(String Bookid);
}
