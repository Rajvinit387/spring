package com.example.onetoone.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;




@Entity
public class product {
	
	
	@Id
	private String pidString;
	
	
	private String pnameString;
	
	
	@ManyToMany(mappedBy = "products",fetch = FetchType.EAGER)
	private List<category> categories= new ArrayList<>();


	public List<category> getCategories() {
		return categories;
	}


	public void setCategories(List<category> categories) {
		this.categories = categories;
	}


	public product(String pidString, String pnameString) {
		super();
		this.pidString = pidString;
		this.pnameString = pnameString;
	}


	public product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getPidString() {
		return pidString;
	}


	public void setPidString(String pidString) {
		this.pidString = pidString;
	}


	public String getPnameString() {
		return pnameString;
	}


	public void setPnameString(String pnameString) {
		this.pnameString = pnameString;
	}
	
	
	
	
	
	

}
