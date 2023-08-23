package com.example.jsonimg.controller;

import java.io.ByteArrayInputStream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.example.jsonimg.services.pdfservice;

@Controller
public class pdfcontroller {
	
	@Autowired
	private pdfservice pdfservice;
	
	@GetMapping("/createpdf")
	public ResponseEntity<InputStreamResource> createpdf()
	{
	ByteArrayInputStream PDF=	this.pdfservice.createpdf();
	HttpHeaders httpHeaders= new org.springframework.http.HttpHeaders();
	httpHeaders.add("Content-Disposition", "inline;file=lcwd.pdf");
	return ResponseEntity.ok().headers(httpHeaders).
			contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(PDF));
	
	
	}

}