package com.masai.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.masai.DTO.CustomerDTO;
import com.masai.exception.CustomerException;
import com.masai.exception.TripException;
import com.masai.model.CompletedTrips;
import com.masai.model.Customer;
import com.masai.model.Driver;
import com.masai.model.TripBooking;


public interface CustomerService {

	public Customer register(Customer user) throws CustomerException;
	
	public List<Customer> getCustomer();
    
	public Customer updatePassword(CustomerDTO dto, String mobile, String key) throws CustomerException; 
	
	public String deleteCustomer(CustomerDTO dto, String key) throws CustomerException;
	
	public Customer updateCustomer(Customer customer,String mobile, String key) throws CustomerException;
	
	public List<Driver> getAvailableDrivers();
	
	public List<Driver> generalListOfDrivers();
	
	public TripBooking bookTrip(TripBooking trip, String key  );  
	
	public String cancelTrip(String key, Integer tripId) throws TripException;
	
	public String logoutCustomer(String key);
	
	public String completeTrip(String key, Integer tripId);
	
	public List<CompletedTrips> alltripHistory(String key);
	
	public TripBooking updateTrip(TripBooking trip, String key);
}
