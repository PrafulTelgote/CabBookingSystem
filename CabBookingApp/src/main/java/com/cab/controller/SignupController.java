package com.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cab.models.SignupDetails;
import com.cab.services.SignupService;

@RestController
public class SignupController {
	@Autowired
	private SignupService signUpService;
	
	@PostMapping("/signUp")
	public ResponseEntity<SignupDetails> createNewSignUpHandler(@RequestBody SignupDetails newSignUp) {	
		
		SignupDetails newSignupDetails = signUpService.createNewSignUp(newSignUp);
		
		return new ResponseEntity<SignupDetails>(newSignupDetails,HttpStatus.CREATED);
	}
	
	@PutMapping("/updateSignUp")
	public ResponseEntity<SignupDetails> updateSignUpDetailsHandler(@RequestBody SignupDetails signUp, @RequestParam String key)
	{
		SignupDetails newUpdatedSignUp = signUpService.updateSignUpDetails(signUp,key);	
		
		return new ResponseEntity<SignupDetails>(newUpdatedSignUp,HttpStatus.ACCEPTED);
	}
}