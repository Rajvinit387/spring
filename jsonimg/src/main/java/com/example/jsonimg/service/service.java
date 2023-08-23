package com.example.jsonimg.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsonimg.helper.Helper;
import com.example.jsonimg.model.Userg;
import com.example.jsonimg.repo.usergrepo;

@Service
public class service {
	@Autowired
	private usergrepo usergrepo;
	
	
	public ByteArrayInputStream getactualdata() throws IOException {
		List<Userg> usergs= usergrepo.findAll();
	ByteArrayInputStream byteArrayInputStream =	Helper.datatoexcel(usergs);
	return byteArrayInputStream;
		
	}

}
