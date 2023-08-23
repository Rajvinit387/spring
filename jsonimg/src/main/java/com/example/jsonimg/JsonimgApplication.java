package com.example.jsonimg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jsonimg.repo.usergrepo;

@SpringBootApplication
public class JsonimgApplication  implements CommandLineRunner{
	
	@Autowired
	private usergrepo usergrepo;

	public static void main(String[] args) {
		SpringApplication.run(JsonimgApplication.class, args);
	}

	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		usergrepo.findAll().forEach(user-> System.out.println(user.getCityString()));
		
		
		
	}

}
