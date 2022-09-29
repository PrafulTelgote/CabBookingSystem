package com.cab.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BasicDetails {
	
	@NotNull(message = "Please Provide a Username")
	private String username;
	
	@NotNull(message = "Password Section is mandatory.please enter a password")
	private String password;
	
	@NotNull(message = "Enter your address and it's mandatory")
	private String address;
	
	@NotNull(message = "Mobile number can't be empty")
	private String mobile;
	
	@NotNull(message = "Email Section can not be null.")
	@Email(message = "Please enter a valid email address.")
	private String email;
	

}
