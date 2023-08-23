package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.entities.Person;

public interface personrepository  extends JpaRepository<Person,Integer>{
	
	@Query("SELECT CASE WHEN COUNT(s) >0 THEN TRUE ELSE FALSE END FROM Person s where s.personId=?1")
     Boolean isPersonexistsbyId(Integer id);
}
