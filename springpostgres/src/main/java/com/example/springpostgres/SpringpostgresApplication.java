package com.example.springpostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.springpostgres.dao.Studentrepository;

@SpringBootApplication
public class SpringpostgresApplication  implements CommandLineRunner{
	
	@Autowired
	private Studentrepository studentrepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringpostgresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.studentrepository.inserttable("vinit", "Muzaffarpur");
		
	}

}
