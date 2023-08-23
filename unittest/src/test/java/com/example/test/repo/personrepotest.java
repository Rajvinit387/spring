package com.example.test.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.test.entities.Person;
import com.example.test.repository.personrepository;


@SpringBootTest
public class personrepotest {
	
	
	@Autowired
	private personrepository personrepository;
	
	@Test
	void isPersonexistsbyId()
	{
		Person person=new Person();
		person.setPersonCityString("delhi");
		person.setPersonnameString("vinit");
		this.personrepository.save(person);
	Boolean xBoolean=	personrepository.isPersonexistsbyId(person.getPersonId());
	assertThat(xBoolean).isTrue();
	}
	
	
	@AfterEach
	void tearDown()
	{
		System.out.println("after test");
		this.personrepository.deleteAll();
	}
	
	@BeforeEach
	void setUp()
	{
		System.out.println("before test");
	}

}
