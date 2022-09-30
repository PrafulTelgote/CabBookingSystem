package com.cab.models;



public class TripBookingDTO {

	private Integer trimBookingId;
	private String username;
	private String password;
	private String fromLocation;
	private String toLocation;
	private Float distanceInKm;
	
	
	public Integer getTrimBookingId() {
		return trimBookingId;
	}
	public void setTrimBookingId(Integer trimBookingId) {
		this.trimBookingId = trimBookingId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Float getDistanceInKm() {
		return distanceInKm;
	}
	public void setDistanceInKm(Float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}
	
	@Override
	public String toString() {
		return "TripBookingDTO [trimBookingId=" + trimBookingId + ", username=" + username + ", password=" + password
				+ ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", distanceInKm=" + distanceInKm
				+ "]";
	}
	
	
	
}
