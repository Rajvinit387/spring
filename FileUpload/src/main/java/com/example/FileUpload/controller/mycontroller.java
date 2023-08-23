package com.example.FileUpload.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.FileUpload.payload.FileResponse;
import com.example.FileUpload.services.fileservice;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class mycontroller {
	
	@Autowired
	private fileservice fileservice;
	
	
	@Value("${project.image}")
	private String pathString;
	
	@PostMapping("/upload")
	public ResponseEntity<FileResponse>  fileupload(
			
			@RequestParam("image") MultipartFile image) throws IOException
	{
	String fileString=	this.fileservice.uploadimage(pathString, image);
		return new ResponseEntity<>(new FileResponse(fileString,"uploaded successfully"),HttpStatus.OK);
		
	}
	
	
	@GetMapping(value = "/images/{image_name}", produces= MediaType.IMAGE_JPEG_VALUE)
	public void downloadimage(@PathVariable("image_name") String image_name,
			HttpServletResponse response) throws IOException
	
	{
	InputStream resourceInputStream=	this.fileservice.getresourceInputStream(pathString, image_name);
	response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	StreamUtils.copy(resourceInputStream, response.getOutputStream());
	
	
	}
	

}
