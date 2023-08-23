package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class UnittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnittestApplication.class, args);
	}

}
