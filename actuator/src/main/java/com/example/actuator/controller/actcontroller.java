package com.example.actuator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actuator.helper.Student;

@RestController
public class actcontroller {
	
	
	@Autowired
	private Student student;
	
	@GetMapping("/home")
	public Map<String, String> getdetails()
	{
		return Map.of("name","vinit");
		
	}

}
