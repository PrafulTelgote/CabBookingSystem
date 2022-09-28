package com.cab.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends BasicDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;

}
