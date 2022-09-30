//package com.cab.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import com.cab.models.LoginDetails;
//import com.cab.services.LoginService;
//
//@RestController
//public class LoginController {
//	@Autowired
//	private LoginService loginService;
//	
//	@PostMapping("/login")
//	public String loginHandler(@RequestBody LoginDetails loginData) {
//		return loginService.logInAccount(loginData);
//	}
//	
//	@PatchMapping("/logout")
//	public String logOutFromAccount(@RequestParam String key)
//	{
//		return loginService.logOutFromAccount(key);
//	}
//}
