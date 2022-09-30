package com.cab.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.exceptions.LoginException;
import com.cab.models.SignupDetails;
import com.cab.repository.SignupDao;


@Service
public class SignupServiceImpl implements SignupService {


	@Autowired
	private SignupDao signUpDAO;
	
	@Autowired
	private CurrentSessionService getCurrentLoginUserSession;
	
	@Override
	public SignupDetails createNewSignUp(SignupDetails newSignUp) {
		
		Optional<SignupDetails> opt = signUpDAO.findByUserName(newSignUp.getUserName());
		if(opt.isPresent())
		{
			throw new LoginException("User Already Exist!");
		}
		
		return signUpDAO.save(newSignUp);
	}

	@Override
	public SignupDetails updateSignUpDetails(SignupDetails signUp, String key) {
		
		SignupDetails signUpDetails = getCurrentLoginUserSession.getSignUpDetails(key);
		
		if(signUpDetails == null)
		{
			throw new LoginException("UnAuthorized!!! No User Found....Try To login first!");
		}
		
		if(signUpDetails.getUserId() == signUp.getUserId())
			{
			signUpDAO.save(signUp);
			return signUp;
			}
		else
			throw new LoginException("Can't change UserId!!");
	}

}

