package com.example.test.service;

import static org.mockito.Mockito.verify;

import javax.sound.midi.VoiceStatus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.repository.personrepository;


@ExtendWith(MockitoExtension.class)
public class personservicetest {
	
	@Mock
	private personrepository personrepository;
	
	
	private personservice personservice;
	
	
	@Test
	void getAllPersons()
	{
		personservice.getAllPersons();
		verify(personrepository).findAll();
	}
	
	@BeforeEach
	void setUp()
	{
		this.personservice=new personservice(personrepository);
	   
	}

}
