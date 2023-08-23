package com.example.demo1.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo1.helper.fileupload;

@RestController
public class FILECONTROLLER {
	
	@Autowired
	private fileupload fileupload;
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadfile(@RequestParam("file") MultipartFile file)	{
	
//		System.out.println(file.getContentType());
//		System.out.println(file.getName());
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
		
		
		if(file.isEmpty())
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("must contain file");
		if(!(file.getContentType().equals("image/jpeg")))
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("must contain image file");
		
	boolean x= fileupload.Uploadfile(file);
	if(x==true)
//		
//		return ResponseEntity.ok("file uploaded successfully....");
		return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
	else {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("some errror occured");
	}
		
	}

}
