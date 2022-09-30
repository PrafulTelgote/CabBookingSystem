package com.cab.services;

import com.cab.exceptions.LoginException;
import com.cab.models.SignupDetails;

public interface SignupService {
	
	public SignupDetails createNewSignUp(SignupDetails signUp) throws LoginException;;
	
	public SignupDetails updateSignUpDetails(SignupDetails signUp,String key) throws LoginException;;

}
