package com.example.demo1.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo1.entities.book;

public interface bookRepository  extends CrudRepository<book, Integer>{
	

}
