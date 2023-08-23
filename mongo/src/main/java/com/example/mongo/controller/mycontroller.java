package com.example.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.entities.Student;
import com.example.mongo.repo.studentrepository;

@RestController
@RequestMapping("/student")
public class mycontroller {
	
	@Autowired
	private studentrepository studentrepository;
	
	@PostMapping("/")
	public ResponseEntity<?> addstudent(@RequestBody Student student)
	{
	Student saveStudent=	this.studentrepository.save(student);
	return ResponseEntity.ok(saveStudent);
		
	}

	
	

	@GetMapping("/")
	public ResponseEntity<?> getStudent()
	{
	
	return ResponseEntity.ok(this.studentrepository.findAll());
		
	}

}
