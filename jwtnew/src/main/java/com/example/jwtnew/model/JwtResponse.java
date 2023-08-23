package com.example.jwtnew.model;

public class JwtResponse {
	
private String jwttokenString;

private String usernameString;

public JwtResponse() {
	super();
	// TODO Auto-generated constructor stub
}

public JwtResponse(String jwttokenString, String usernameString) {
	super();
	this.jwttokenString = jwttokenString;
	this.usernameString = usernameString;
}

public String getJwttokenString() {
	return jwttokenString;
}

public void setJwttokenString(String jwttokenString) {
	this.jwttokenString = jwttokenString;
}

public String getUsernameString() {
	return usernameString;
}

public void setUsernameString(String usernameString) {
	this.usernameString = usernameString;
}

@Override
public String toString() {
	return "JwtResponse [jwttokenString=" + jwttokenString + ", usernameString=" + usernameString + "]";
}






}
