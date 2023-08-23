package com.example.springanno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springanno.Student;

//@Controller
@RestController
public class controller {
	
	@Autowired
	@Qualifier("id1")
	private Student student;
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	//@ResponseBody
	public Student home(@RequestBody Student st)
	{
		st.studying();
		System.out.println("this is home page");
		return this.student;
	}
	
	@RequestMapping(value="/home/{idli}",method = RequestMethod.GET)
	public String abc( @PathVariable("idli") Integer i) {
		System.out.println(i);
		
		return String.valueOf(i);
	}

}
