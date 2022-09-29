package com.cab.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(AdminException adminException, WebRequest req){
		ErrorDetails errors = new ErrorDetails(LocalDateTime.now(), adminException.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(CustomerException customerException, WebRequest req){
		ErrorDetails errors = new ErrorDetails(LocalDateTime.now(), customerException.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DriverException.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(DriverException driverException, WebRequest req){
		ErrorDetails errors = new ErrorDetails(LocalDateTime.now(), driverException.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CabException.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(CabException cabException, WebRequest req){
		ErrorDetails errors = new ErrorDetails(LocalDateTime.now(), cabException.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(Exception exception, WebRequest req){
		ErrorDetails errors = new ErrorDetails(LocalDateTime.now(), exception.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
}
