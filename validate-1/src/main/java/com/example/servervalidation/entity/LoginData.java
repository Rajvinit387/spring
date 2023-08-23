package com.example.servervalidation.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {
	
	
	@NotBlank(message="user name cannot be empty")
	@Size(min =3, max=12, message = "must be between these")
 private String usetnameString;
	
	
@NotBlank(message = "SHOULD NOT BE EMPTY")
 private String useremailString;
	
	
	
public LoginData(String usetnameString, String useremailString) {
	super();
	this.usetnameString = usetnameString;
	this.useremailString = useremailString;
}
public String getUsetnameString() {
	return usetnameString;
}
public void setUsetnameString(String usetnameString) {
	this.usetnameString = usetnameString;
}
public String getUseremailString() {
	return useremailString;
}
public LoginData() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "logindata [usetnameString=" + usetnameString + ", useremailString=" + useremailString + "]";
}
public void setUseremailString(String useremailString) {
	this.useremailString = useremailString;
}
}
