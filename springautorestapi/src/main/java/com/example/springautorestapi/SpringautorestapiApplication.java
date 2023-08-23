package com.example.springautorestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringautorestapiApplication implements CommandLineRunner {
	
	@Autowired
	private bookrepository bookrepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringautorestapiApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		book book= new book();
		book.setAuthorString("abc");
		book.setContentString("dbjdfnjdvfjn");
		book.setTitleString("i am in love");
		book.setPagesInteger(500);
		this.bookrepository.save(book);
		
		book book1= new book();
		book1.setAuthorString("abc1");
		book1.setContentString("dbjdfnjdvfjn1");
		book1.setTitleString("i am in love1");
		book1.setPagesInteger(500);
		this.bookrepository.save(book1);
		// TODO Auto-generated method stub
		
	}

}
