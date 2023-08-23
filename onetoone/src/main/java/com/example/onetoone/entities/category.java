package com.example.onetoone.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class category {
	
	
	@Id
	private String cidString;
	
	
	private String titleString;
	
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<product> products = new ArrayList<>();


	public category(String cidString, String titleString) {
		super();
		this.cidString = cidString;
		this.titleString = titleString;
	}


	public category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCidString() {
		return cidString;
	}


	public void setCidString(String cidString) {
		this.cidString = cidString;
	}


	public String getTitleString() {
		return titleString;
	}


	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}


	public List<product> getProducts() {
		return products;
	}


	public void setProducts(List<product> products) {
		this.products = products;
	}

	
	
	
	
}
