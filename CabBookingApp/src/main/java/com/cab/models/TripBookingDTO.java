package com.cab.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TripBookingDTO {

	private Integer trimBookingId;
	private String username;
	private String password;
	private String fromLocation;
	private String toLocation;
	private Float distanceInKm;
	
}
