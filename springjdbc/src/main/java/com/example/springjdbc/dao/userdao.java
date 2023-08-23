package com.example.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class userdao {
	
	
	
	@	Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public int create()
	{
		String queryString="CREATE TABLE IF NOT EXISTS User(id int primary key, name varchar(200), age int, city varchar(100))";
		int update=this.jdbcTemplate.update(queryString);
		System.out.println("query executed....."+update);
		return update;
		
	}
	
	
	
	public int insert(Integer id, String name,Integer age, String city)
	{
		String queryString="INSERT INTO User(id, name, age, city) values (?,?,?,?)";
		int update=this.jdbcTemplate.update(queryString, new Object[] {
				
				id,name,age,city
		});
		System.out.println("query executed....."+update);
		return update;
		
	}

}
