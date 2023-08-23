package com.example.thymeleafdemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.ui.Model;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class thymecontroller {
	
	
	
	
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public String about(Model model) {
		
	
		model.addAttribute("name","Vinit");
		model.addAttribute("currentdate",new Date().toLocaleString());
		return "about";
		
		
	}
	
	//for looping
	@RequestMapping(value="/loop", method = RequestMethod.GET)
 public String loop(Model model) {
		List<String> nameStrings=   List.of("Vinit","Raj","Alexa","bliss");
		model.addAttribute("names",nameStrings);
		
	 
	 return "loop";
	 
	
}
	
	
	
	@RequestMapping(value="/if", method = RequestMethod.GET)
 public String ifcondition(Model model) {
	model.addAttribute("activestatus",false);
	model.addAttribute("gender","M");
	List<Integer> intsIntegers= List.of(1,445);
	model.addAttribute("ints", intsIntegers);
	 return "cif";
	 
	
}
	
	@GetMapping("/service")
	public String include(Model model)
	{
		model.addAttribute("vinit","raj");
		model.addAttribute("raj","vinit");
		return "service";
		
	}
	
	@GetMapping("/aboutnew")
	public String hhhh()
	{
		
		return "aboutnew";
		
	}
	
	@GetMapping("/contact")
	public String hrhhh()
	{
		
		return "contact";
		
	}
	
	
	@GetMapping("/mc")
	public String mc()
	{
		
		return "mc";
		
	}
	
	
	
	
	
	
	
}
