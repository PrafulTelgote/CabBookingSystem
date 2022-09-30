package com.cab.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.exceptions.LoginException;
import com.cab.models.CurrentSessionDetails;
import com.cab.models.SignupDetails;
import com.cab.repository.CurrentSessionDao;
import com.cab.repository.SignupDao;

@Service
public class CurrentSessionServiceImpl implements CurrentSessionService {

	@Autowired
	private CurrentSessionDao currentUserSessionDAO;
	
	@Autowired
	private SignupDao signUpDAO;
	
	@Override
	public CurrentSessionDetails getCurrentUserSession(String key) {
		
		Optional<CurrentSessionDetails> currentUser = currentUserSessionDAO.findByUuid(key);
		if(!currentUser.isPresent())
		{
			throw new LoginException("UnAuthorized!!!");
		}
		return currentUser.get();
	}

	@Override
	public Integer getCurrentUserSessionId(String key) {
		
		Optional<CurrentSessionDetails> currentUser = currentUserSessionDAO.findByUuid(key);
		if(!currentUser.isPresent())
		{
			throw new LoginException("UnAuthorized!!!");
		}
		return currentUser.get().getId();
		
	}

	@Override
	public SignupDetails getSignUpDetails(String key) {
		
		Optional<CurrentSessionDetails> currentUser = currentUserSessionDAO.findByUuid(key);
		if(!currentUser.isPresent())
		{
			return null;
		}
		Integer SignUpUserId = currentUser.get().getUserId();
		System.out.println(SignUpUserId );
		
		return (signUpDAO.findById(SignUpUserId)).get();
	}

}

