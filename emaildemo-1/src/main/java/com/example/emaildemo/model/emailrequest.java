package com.example.emaildemo.model;

public class emailrequest {
	
	
	private String to;
	private String subject;
	private String message;
	public emailrequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emailrequest(String to, String subject, String message) {
		super();
		this.to = to;
		this.subject = subject;
		this.message = message;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "emailrequest [to=" + to + ", subject=" + subject + ", message=" + message + "]";
	}

}
