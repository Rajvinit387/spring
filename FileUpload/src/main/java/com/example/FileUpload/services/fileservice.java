package com.example.FileUpload.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface fileservice {

	
	String uploadimage(String path,MultipartFile multipartFile) throws IOException;
	InputStream getresourceInputStream(String path, String file) throws FileNotFoundException;
}
