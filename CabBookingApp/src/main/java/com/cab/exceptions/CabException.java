package com.cab.exceptions;

public class CabException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public CabException() {
	}
	public CabException(String message) {
		super(message);
	}

}
