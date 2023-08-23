package com.example.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
	
	
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		String textString="this is private page";
		return textString;
	}

}
