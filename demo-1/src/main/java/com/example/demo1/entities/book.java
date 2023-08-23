package com.example.demo1.entities;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.stereotype.Component;

import com.example.demo1.validate.namevalid;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="books")
public class book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book(int id, String name, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	@namevalid
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author author;

	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
}
