package com.springdemo.book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,String> {

}
