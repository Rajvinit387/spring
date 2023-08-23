package com.example.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.entities.Student;

public interface studentrepository extends MongoRepository<Student, Integer> {
	
	
	
	

}
