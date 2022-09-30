package com.cab.models;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BasicDetails {
	
	@NotNull(message = "Please Provide a Username")
	@Pattern(regexp = "^[a-zA-Z0-9]{3,25}", message = "length must be >=3")
	private String username;
	
	@NotNull(message = "Password Section is mandatory.please enter a password")
	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters in length and can include A-Z, a-z, 0-9, or special characters !@#$%^&*_")
	private String password;
	
	@NotNull(message = "Enter your address and it's mandatory")
	private String address;
	
	@NotNull(message = "Mobile number can't be empty")
	@Column(unique = true)
	@Pattern(regexp = "[6789]{1}[0-9]{9}", message = "Enter valid 10 digit mobile number")
	private String mobile;
	
	@NotNull(message = "Email Section can not be null.")
	@Column(unique = true)
	@Email(message = "Please enter a valid email address.")
	private String email;
}
