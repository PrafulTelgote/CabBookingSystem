//package com.cab.services;
//
//import java.time.LocalDateTime;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cab.exceptions.LoginException;
//import com.cab.models.CurrentSessionDetails;
//import com.cab.models.LoginDetails;
//import com.cab.models.SignupDetails;
//import com.cab.repository.CurrentSessionDao;
//import com.cab.repository.LoginDao;
//import com.cab.repository.SignupDao;
//
//
//@Service
//public class LoginServiceImpl implements LoginService {
//
//	@Autowired
//	private SignupDao signUpDAO;
//	
//	@Autowired
//	private CurrentSessionDao currentUserSessionDAO;
//	
//	@Autowired
//	private CurrentSessionService getCurrentLoginUserSession;
//	
//	@Autowired
//	private LoginDao loginDataDAO;
//	
//	@Override
//	public String logInAccount(LoginDetails loginData) {
//		
//Optional<SignupDetails> opt = signUpDAO.findById(loginData.getUserId());
//		
//		if(!opt.isPresent())
//		{
//			throw new LoginException("Invalid Login UserId");
//		}
//		
//		SignupDetails newSignUp = opt.get();
//		
//		Integer newSignUpId = newSignUp.getUserId();
//		Optional<CurrentSessionDetails> currentUserOptional = currentUserSessionDAO.findByUserId(newSignUpId);
//		
//		if(currentUserOptional.isPresent()) {
//			throw new LoginException("User Already login with this UserId");
//		}
//		
//		if((newSignUp.getUserId() == loginData.getUserId()) && (newSignUp.getPassword().equals(loginData.getPassword())))
//		{
//			String key =  "random" + 10*Math.random() + 10*Math.random();  //RandomString.getRandomNumberString();
//			
//			CurrentSessionDetails currentUserSession = new CurrentSessionDetails(newSignUp.getUserId(),key,LocalDateTime.now());
//			currentUserSessionDAO.save(currentUserSession);
//			loginDataDAO.save(loginData);
//			
//			return currentUserSession.toString();		
//		}
//		else
//			throw new LoginException("Invalid UserName or Password!");
//
//	}
//
//	@Override
//	public String logOutFromAccount(String key) {
//		
//		Optional<CurrentSessionDetails> currentUserOptional = currentUserSessionDAO.findByUuid(key);
//		if(!currentUserOptional.isPresent())
//		{
//			throw new LoginException("User has not logged in with this UserId");
//		}
//		CurrentSessionDetails currentUserSession = getCurrentLoginUserSession.getCurrentUserSession(key);
//		
//		currentUserSessionDAO.delete(currentUserSession);
//		
//		Optional<LoginDetails> loginData = loginDataDAO.findById(currentUserOptional.get().getUserId());
//		System.out.println(loginData);
//		loginDataDAO.delete(loginData.get());	
//		return "Logged Out......";
//	}
//
//}
