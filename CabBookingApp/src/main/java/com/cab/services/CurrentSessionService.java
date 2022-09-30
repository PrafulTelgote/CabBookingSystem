package com.cab.services;

import com.cab.exceptions.LoginException;
import com.cab.models.CurrentSessionDetails;
import com.cab.models.SignupDetails;

public interface CurrentSessionService {
	public CurrentSessionDetails getCurrentUserSession(String key) throws LoginException;
	public Integer getCurrentUserSessionId(String key) throws LoginException;
	public SignupDetails getSignUpDetails(String key) throws LoginException;
}