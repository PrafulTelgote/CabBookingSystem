package com.cab.services;

import java.time.LocalDateTime;

import com.cab.exceptions.AdminException;
import com.cab.exceptions.CustomerException;
import com.cab.models.Admin;
import com.cab.models.TripBooking;

import java.util.*;

public interface AdminServices {

	public Admin insertAdmin(Admin admin);
	
	public Admin updateAdmin(Admin admin) throws AdminException;
	
	public Admin deleteAdmin(Integer adminId) throws AdminException;
	
	/*
	public List<TripBooking> getAllTrips();
	
	public List<TripBooking> getTripsCabwise();
	
	public List<TripBooking> getTripsCustomerwise(Integer customerId) throws CustomerException;
	
	public List<TripBooking> getTripsDatewise();
	
	public List<TripBooking> getAllTripsForDays(Integer customerId, LocalDateTime fromDate, LocalDateTime toDate) throws CustomerException;
	*/
	
}
