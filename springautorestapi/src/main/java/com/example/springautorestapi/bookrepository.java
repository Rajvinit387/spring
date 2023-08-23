package com.example.springautorestapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "mybooks",collectionResourceRel = "boo")
public interface bookrepository extends JpaRepository<book, Integer> {
	
	
	
	  

}
