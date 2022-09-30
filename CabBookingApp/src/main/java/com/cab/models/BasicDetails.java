package com.cab.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@MappedSuperclass
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="users")
public class BasicDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userid;

	@NotNull
	@Pattern(regexp="[a-z]{6,12}", message = "Username must be between 6 to 12 characters. Must only contain lowercase characters.")
	private String username;

	@NotNull
	@Pattern(regexp="[a-zA-Z0-9]{6,12}",message="Password must contain between 6 to 12 characters. Must be alphanumeric with both Upper and lowercase characters.")
	private String password;

	@NotNull
	@Pattern(regexp="[0-9]{10}", message = "Mobile number must have 10 digits")
	private String mobile;

	@Email
	@NotNull
	private String email;
	

}
