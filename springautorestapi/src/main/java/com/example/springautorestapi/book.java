package com.example.springautorestapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_collection")
public class book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getContentString() {
		return contentString;
	}
	public void setContentString(String contentString) {
		this.contentString = contentString;
	}
	public String getAuthorString() {
		return authorString;
	}
	public void setAuthorString(String authorString) {
		this.authorString = authorString;
	}
	public Integer getPagesInteger() {
		return pagesInteger;
	}
	public void setPagesInteger(Integer pagesInteger) {
		this.pagesInteger = pagesInteger;
	}
	private String titleString;
	private String contentString;
	private String authorString;
	private Integer pagesInteger;
	

}
