package com.example.emaildemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.emaildemo.model.emailrequest;
import com.example.emaildemo.service.emailservice;

@RestController
public class EmailController {
	
	@Autowired
	private emailservice emailservice;
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "this is email api";
	}
	
	
	@RequestMapping(value="/sendemail",method = RequestMethod.POST)
	public ResponseEntity<?> sendemail(@RequestBody emailrequest req)
	{
		boolean x=this.emailservice.sendemail(req.getSubject(),req.getMessage(),req.getTo());
		if(x)
		return ResponseEntity.ok("email sent....");
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("email not sent....");
		}
	}

}
