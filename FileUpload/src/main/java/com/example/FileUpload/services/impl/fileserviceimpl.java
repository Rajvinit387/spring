package com.example.FileUpload.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.FileUpload.services.fileservice;





@Service
public class fileserviceimpl implements fileservice {

	@Override
	public String uploadimage(String path, MultipartFile multipartFile) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		String nameString= multipartFile.getOriginalFilename();
		String randomString=UUID.randomUUID().toString();
		
		String FILE1=	randomString.concat(nameString.substring(nameString.lastIndexOf(".")));
		
		String filepathString=path+File.separator+FILE1;
		
	
		
		File file= new File(path);
		
		if(!file.exists())
		{
			file.mkdir();
		}
		
		Files.copy(multipartFile.getInputStream(), Paths.get(filepathString));
		
		return nameString;
	}

	@Override
	public InputStream getresourceInputStream(String path, String file) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		String fullpathString=path+ File.separator+file;
		InputStream iStream=new FileInputStream(fullpathString);
		return iStream;
	}

}
