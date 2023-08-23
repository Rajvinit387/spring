package com.example.multipledb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.multipledb.mysql.entities.user;
import com.example.multipledb.mysql.repository.userrepo;
import com.example.multipledb.postgres.entities.product;
import com.example.multipledb.postgres.repository.productrepo;

@SpringBootApplication

public class MultipledbApplication  implements CommandLineRunner {
	
	@Autowired
	private productrepo productrepo;
	
	@Autowired
	private userrepo userrepo;

	public static void main(String[] args) {
		SpringApplication.run(MultipledbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	user u= new user();
	u.setUsercityString("delhi");
	u.setUsernameString("vinit");
	this.userrepo.save(u);
	
	product p= new product();
	p.setNameString("phone");
	p.setPrice(50);
	
	this.productrepo.save(p);
	
	productrepo.findAll().forEach(product -> System.out.println(product.getNameString()));
	userrepo.findAll().forEach(user -> System.out.println(user.getUsernameString()));

		
		
	}

}