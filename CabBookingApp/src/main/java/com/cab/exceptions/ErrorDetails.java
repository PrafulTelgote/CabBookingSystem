package com.cab.exceptions;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDetails {
	
	private LocalDateTime timeStamp;
	private String messsage;
	private String details;
	
	public ErrorDetails(){
		
	}

	public ErrorDetails(LocalDateTime timeStamp, String messsage, String details) {
		super();
		this.timeStamp = timeStamp;
		this.messsage = messsage;
		this.details = details;
	}
	
}
