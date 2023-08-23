package com.example.springanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"MYPACK"})
public class myconfig {
	
	@Bean("id1")
	@Lazy
	public Student studen()
	{
		return new Student("STUDENT1");
	}
	
	
	@Bean("id2")
	@Lazy
	public Student studen1()
	{
		return new Student("STUDENT2");
	}
	


}
