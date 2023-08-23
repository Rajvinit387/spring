package com.example.apixl.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.apixl.entities.product;
import com.example.apixl.helper.Helper;
import com.example.apixl.repo.productrepo;

@Service
public class productservice {
	
	@Autowired
	private productrepo productrepo;
	
	
	public void save(MultipartFile file)
	{
		try {
		List<product> products=	Helper.convert(file.getInputStream());
		this.productrepo.saveAll(products);
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 
	public List<product> getallproducts()
	{
	List<product> products=	this.productrepo.findAll();
	return products;
	}

}
