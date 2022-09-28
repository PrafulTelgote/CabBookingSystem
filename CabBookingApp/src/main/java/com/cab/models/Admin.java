package com.cab.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin extends BasicDetails  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;

}
