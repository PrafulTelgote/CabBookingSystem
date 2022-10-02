package com.masai.service;

import com.masai.DTO.AdminDTO;
import com.masai.DTO.CustomerDTO;
import com.masai.DTO.DriverDTO;
import com.masai.DTO.LoginDTO;
import com.masai.model.AdminSession;
import com.masai.model.DriverSession;
import com.masai.model.UserSession;
import com.masai.DTO.CustomerDTO;

public interface LoginService {

	public AdminSession loginAdmin(LoginDTO dto);

	public UserSession loginCustomer(LoginDTO customer);
	
	public DriverSession loginDriver(LoginDTO dto);

}
