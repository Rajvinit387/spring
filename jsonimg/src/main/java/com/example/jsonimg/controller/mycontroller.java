package com.example.jsonimg.controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.jsonimg.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/users")
public class mycontroller {
	
	
	private Logger logger= LoggerFactory.getLogger(mycontroller.class);
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@PostMapping
	public ResponseEntity<?> adduserinfo(@RequestParam("file") MultipartFile file,
			
			@RequestParam("userdata") String userdata
			) throws JsonMappingException, JsonProcessingException
	{
		
		this.logger.info("add user request");
		this.logger.info("filename {}", file.getOriginalFilename());
		this.logger.info("user {}", userdata);
		
		
	User usernUser=	objectMapper.readValue(userdata, User.class);
	
	
	
	this.logger.info("user final {}", usernUser);
	
		return ResponseEntity.ok("done");
	}
	
	@PostMapping("/uploadfiles")
	public ResponseEntity<?> uploadmultiplefiles(
			@RequestParam("images") MultipartFile[] files
			
			)
	{
		
		
		logger.info("no of files uploaded {}",files.length);
		
	Arrays.stream(files).forEach(mul-> {
	logger.info("file name {}",mul.getOriginalFilename())	;
	});
	return	ResponseEntity.ok("files uploaded");
	
	}

}
