package com.example.demo1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo1.entities.User;

public interface UserRepository  extends CrudRepository<User, Integer>{

	
	
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name, String city);
	
	@Query("select u FROM User u")
	public List<User>  getAllUsers();
	
	
	@Query("select u FROM User u where u.name=:n and u.city=:c")
		public List<User> getuserbynameandcity(@Param("n") String name, @Param("c") String city);
	

@Query(value="select distinct name from user where BINARY name = ?1 ",nativeQuery = true)
public List<String> getest( String names);
}

