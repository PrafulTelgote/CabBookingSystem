package com.cab.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver extends BasicDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	private Integer licenceNo;
	@Embedded
	private Cab cab;
	private Float rating;

}
