package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.service.personservice;

@RestController
public class personcontroller {
	
	
	@Autowired
	private personservice personservice;
	
	
	@GetMapping("/persons")
	public ResponseEntity<?> getallPersons()
	{
		return ResponseEntity.ok(this.personservice.getAllPersons());
	}

}
