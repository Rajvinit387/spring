package com.example.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import MYPACK.DOG;

@SpringBootApplication

public class AnnoApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier("id2")
	private Student syiStudent;
	
	@Autowired
	private emp emp;
	
	
	@Autowired
	private DOG dog;

	public static void main(String[] args)  {
		SpringApplication.run(AnnoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.syiStudent.studying();
		this.emp.job();
		this.dog.bark();
		// TODO Auto-generated method stub
		
	}

}
