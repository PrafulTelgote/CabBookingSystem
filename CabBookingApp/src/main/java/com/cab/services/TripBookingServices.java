package com.cab.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cab.models.BillDetails;
import com.cab.models.TripBooking;
import com.cab.models.TripBookingDTO;

public interface TripBookingServices {

public ResponseEntity<TripBooking> insertTripDetails(TripBookingDTO tripDto);
	
	public ResponseEntity<String> deleteBookedTrip(TripBookingDTO tripDto);
	
	public ResponseEntity<List<TripBooking>> getAllTripsOfCustomer(TripBookingDTO tripDto);
	
	public ResponseEntity<String> calculateBill(TripBookingDTO tripDto);
	
	public ResponseEntity<BillDetails> generateBill(TripBookingDTO tripDto);
}
