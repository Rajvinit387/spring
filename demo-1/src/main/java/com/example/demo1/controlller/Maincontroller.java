package com.example.demo1.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("this is home page");
		return "home";
	}

}
