package com.example.multipledb.mysql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String usernameString;
	
	
	private String usercityString;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsernameString() {
		return usernameString;
	}


	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}


	public String getUsercityString() {
		return usercityString;
	}


	public void setUsercityString(String usercityString) {
		this.usercityString = usercityString;
	}


	public user(int id, String usernameString, String usercityString) {
		super();
		this.id = id;
		this.usernameString = usernameString;
		this.usercityString = usercityString;
	}


	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
