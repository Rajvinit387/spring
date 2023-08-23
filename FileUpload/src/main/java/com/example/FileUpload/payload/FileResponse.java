package com.example.FileUpload.payload;

public class FileResponse {
	
	String filenameString;
	String messageString;
	public FileResponse(String filenameString, String messageString) {
		super();
		this.filenameString = filenameString;
		this.messageString = messageString;
	}
	public String getFilenameString() {
		return filenameString;
	}
	public void setFilenameString(String filenameString) {
		this.filenameString = filenameString;
	}
	public String getMessageString() {
		return messageString;
	}
	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
	

}
