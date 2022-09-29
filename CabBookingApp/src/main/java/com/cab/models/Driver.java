package com.cab.models;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Driver extends BasicDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	
	@OneToOne(cascade = CascadeType.ALL)
	
	@JoinColumn(name = "cabId")
	
	@JsonIgnore
	private Cab cab;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cabDriver",orphanRemoval = true)
	@JsonIgnore
	List<TripBooking> tripDetailsList = new ArrayList<>();
	
	@NotNull(message = "License Number cannot be null")
	@Column(unique = true)
	private String licenseNumber;
	
	private Boolean availablity = true;
	
	/*Getter Setter Methods Start*/

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public List<TripBooking> getTripDetailsList() {
		return tripDetailsList;
	}

	public void setTripDetailsList(List<TripBooking> tripDetailsList) {
		this.tripDetailsList = tripDetailsList;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Boolean getAvailablity() {
		return availablity;
	}

	public void setAvailablity(Boolean availablity) {
		this.availablity = availablity;
	}
	
	/*Getter Setter Methods Ended*/
	
	
	/*override method*/

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", cab=" + cab + ", tripDetailsList=" + tripDetailsList
				+ ", licenseNumber=" + licenseNumber + ", availablity=" + availablity + "]";
	}
	

	
	
	
	
	
	

}
