package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.TripBooking;
import com.masai.repository.TripbookingDao;

@Service
public class TripBookingServicesImpl implements TripBookingServices{

	@Autowired
	TripbookingDao tripDao;
	@Override
	public TripBooking newTrip(TripBooking trip) {
		
		return tripDao.save(trip);

	}
	

}
