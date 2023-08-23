package com.example.servervalidation.controller;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.servervalidation.entity.LoginData;

import jakarta.validation.Valid;

@Controller
public class formcontroller {
	
	
	@GetMapping("/form")
	public String tttt(Model model) {
		model.addAttribute("object", new LoginData());
		
		return "form";
		
	}
	
	@PostMapping("/process")
	public String processform(@Valid @ModelAttribute("object") LoginData obj, BindingResult result) {
		
		if(result.hasErrors()==true)
				{
			System.out.println("result");
			return "form";
				}
		System.out.println(obj);
		
		return "success";
		
	}

}
