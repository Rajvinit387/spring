package com.example.emaildemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailcontroller {
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "email api";
	}

}
