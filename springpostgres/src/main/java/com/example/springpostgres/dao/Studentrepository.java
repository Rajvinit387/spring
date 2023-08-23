package com.example.springpostgres.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Studentrepository {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createtable()
	{
		String queryString="CREATE TABLE STUDENT(id SERIAL PRIMARY KEY, name varchar(255) NOT NULL, city varchar(100))";
	   int update= this.jdbcTemplate.update(queryString);
	   System.out.println(update);
	}
	
	
	
	
	public void inserttable(String NAME, String CITY)
	{
		String queryString="INSERT INTO  STUDENT(name,city) values(?,?)";
	   int update= this.jdbcTemplate.update(queryString,NAME, CITY);
	   System.out.println(update+" ROWS INSERTED");
	}
	
	

}
