package com.example.securitynew.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class homecontroller {
	
	
	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/normaluser")
	public ResponseEntity<String> home(){
		return ResponseEntity.ok("i am home user");
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/adminuser")
	public ResponseEntity<String> admin(){
		return ResponseEntity.ok("i am admin user");
	}
	
	@GetMapping("/publicuser")
	public ResponseEntity<String> publipagEntity(){
		
		return ResponseEntity.ok("public user");
	}

}
