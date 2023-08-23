package com.example.apixl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.apixl.entities.product;
import com.example.apixl.helper.Helper;
import com.example.apixl.service.productservice;

@RestController
@CrossOrigin("*")
public class homecontroller {
	
	@Autowired
	private productservice productservice;
	
	
	@PostMapping("/product/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file)
	{
		if(Helper.checkformat(file))
		{
			this.productservice.save(file);
			return ResponseEntity.ok(Map.of("message","uploaded successfully"));
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("PLS UPLOAD EXCEL FILE ONLY");
		}
	}
	
	@GetMapping("/get")
	public List<product> getProducts()
	{
		return this.productservice.getallproducts();
	}
	

}
