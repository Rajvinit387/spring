package com.example.springjdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.springjdbc.dao.userdao;

@SpringBootApplication
public class SpringjdbcApplication  implements CommandLineRunner{
	
	@Autowired
	private userdao userdao;

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
	  
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this.userdao.create());
		this.createuser();
		// TODO Auto-generated method stub
		
	}
	
	
	public void createuser() throws NumberFormatException, IOException
	{
		BufferedReader bReader= new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("enter id   ");
		
		Integer idInteger=Integer.parseInt(bReader.readLine());
		
		
System.out.println("user name   ");
		
		String name=bReader.readLine();
		
		
		
System.out.println("enter age   ");
		
		Integer age=Integer.parseInt(bReader.readLine());
		
		
		
System.out.println("enter city   ");
		
		String city=bReader.readLine();
		
		
		int i=this.userdao.insert(idInteger, name, age, city);
		System.out.println(i+"  user added");
		
	}

}
