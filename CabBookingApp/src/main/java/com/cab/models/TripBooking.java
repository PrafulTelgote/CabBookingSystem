package com.cab.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TripBooking {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer trimBookingId;
	private Integer customerId;
	private Driver driver;
	private String fromLocation;
	private String toLocation;
	private LocalDateTime fromDateTime;
	private LocalDateTime toDateTime;
	private Boolean status;
	private Float distanceInKm;
	private Float bill;

}
