package com.cab.models;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class TripBooking {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer trimBookingId;
	
	private Integer customerId;
	
	@ManyToOne
	@JoinColumn(name = "cabDriverId")
	private Driver driver;
	
	@NotNull(message = "Pickup Location cannot be null")
	private String fromLocation;
	
	@NotNull(message = "Drop Location cannot be null")
	private String toLocation;
	

	
	private LocalDateTime fromDateTime;
	
	
	private LocalDateTime toDateTime;
	
	private Boolean status = false;
	
	@NotNull(message = "Distance cannot be null")
	private Float distanceInKm;
	
	private Float bill;

}
