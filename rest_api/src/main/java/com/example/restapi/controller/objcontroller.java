package com.example.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.dao.osirepository;
import com.example.restapi.entities.obj33;
import com.example.restapi.entities.obj11;
import com.example.restapi.entities.obj22;
import com.example.restapi.service.objservice;

@RestController
public class objcontroller {
	
	@Autowired
	private objservice objservice;
	
	@PostMapping("/obj33")
	public ResponseEntity<obj33> addobj33(@RequestBody obj33 xx)
	{
	
		obj33 ss= null;
		try
		
		{
		ss= this.objservice.addObj33(xx);
		System.out.println(ss);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
	}
	
	@PostMapping("/obj11")
	public ResponseEntity<obj11> addobj11(@RequestBody obj11 oo)
	{
		try
		{
		obj11 oo1= null;
		oo1= this.objservice.addObj11(oo);
		System.out.println(oo);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
	}
	
	@PostMapping("/obj22")
	public ResponseEntity<obj22> addobj22(@RequestBody obj22 osi)
	{
		obj22 os= null;
		try {
		os= this.objservice.addObj22(osi);
		System.out.println(os);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	}
}


