package com.example.demo1.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="authors")
public class Author {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	
	
	@OneToOne(mappedBy = "author")
	@JsonBackReference
	private book book;
	
	@Column(name="first_name")
	private String fname;
	public book getBook() {
		return book;
	}
	public void setBook(book book) {
		this.book = book;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String lname;

}
