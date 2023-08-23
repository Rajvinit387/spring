package com.example.demo1.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class fileupload {
	
	public fileupload() throws IOException
	{}
	
	
	
	public final String uploadfileString=new ClassPathResource("static/image/").getFile().getAbsolutePath();
	//	public final String uploadfileString="C:\\Users\\Vinit Raj\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\demo-1\\src\\main\\resources\\static\\image";
public boolean Uploadfile(MultipartFile file)





{
	boolean f= false;
	
	try {
		
		
//		InputStream iStream=file.getInputStream();	
//		byte b[]= new byte[iStream.available()];
//		iStream.read(b);
//		FileOutputStream fileOutputStream= new FileOutputStream(uploadfileString+"\\"+file.getOriginalFilename());
//		fileOutputStream.write(b);
//		fileOutputStream.flush();
//		fileOutputStream.close();
		
		
		Files.copy(file.getInputStream(), Paths.get(uploadfileString+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		f= true;
		
	} catch (Exception e) {
	e.printStackTrace();
	}
	return f;
	
}
}
