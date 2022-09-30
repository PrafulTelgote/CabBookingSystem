package com.cab.exceptions;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {


	@ExceptionHandler(TripInProgress.class)
	public ResponseEntity<MyErrorDetails> tripInProgress(TripInProgress mve,WebRequest wr) {
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), mve.getMessage()
, wr.getDescription(false));
		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
		return re;
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExpHandlerMain(Exception ie, WebRequest wr) {
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
		return re;
	}
	
}
