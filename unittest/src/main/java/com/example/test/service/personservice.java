package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entities.Person;
import com.example.test.repository.personrepository;


@Service
public class personservice {
	
	
	@Autowired
	private personrepository personrepository;
	
	public List<Person> getAllPersons()
	{
		return this.personrepository.findAll();
	}

	public personservice(personrepository personrepository) {
	
		this.personrepository = personrepository;
	}

}
