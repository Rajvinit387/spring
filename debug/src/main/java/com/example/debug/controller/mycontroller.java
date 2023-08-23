package com.example.debug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
	
	
	
	@GetMapping("/home")
	public String getabout()
	{
		
		String string="dfhudfjdf DDD";
		string=string.toLowerCase();
		string=string.toUpperCase();
		return string;
	}

}
