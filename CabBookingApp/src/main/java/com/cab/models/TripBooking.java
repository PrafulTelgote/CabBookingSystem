package com.cab.models;

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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customerId")
	private Integer customerId;
	
	@ManyToOne
	@JoinColumn(name = "cabDriverId")
	private Driver driver;
	
	@NotNull(message = "Pickup location should not be null")
	private String fromLocation;
	
	@NotNull(message = "Drop location should not be null")
	private String toLocation;
	
	
	private Boolean status = false;
	
	@NotNull(message = "Distance should not be null")
	private Float distanceInKm;
	
	private Float bill;

	public TripBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TripBooking(Integer trimBookingId, Integer customerId, Driver driver,
			@NotNull(message = "Pickup location should not be null") String fromLocation,
			@NotNull(message = "Drop location should not be null") String toLocation, Boolean status,
			@NotNull(message = "Distance should not be null") Float distanceInKm, Float bill) {
		super();
		this.trimBookingId = trimBookingId;
		this.customerId = customerId;
		this.driver = driver;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.status = status;
		this.distanceInKm = distanceInKm;
		this.bill = bill;
	}

	public Integer getTrimBookingId() {
		return trimBookingId;
	}

	public void setTrimBookingId(Integer trimBookingId) {
		this.trimBookingId = trimBookingId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Float getDistanceInKm() {
		return distanceInKm;
	}

	public void setDistanceInKm(Float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}

	public Float getBill() {
		return bill;
	}

	public void setBill(Float bill) {
		this.bill = bill;
	}

	
	
}
