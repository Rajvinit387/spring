package com.example.demo1;

import java.sql.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myconfig {
	
	
	@Bean
	public Student getStudent()
	{
		return  new Student();
	}
	
	@Bean
	public Date1 getDate1()
	{
		return  new  Date1();
	}

}
