package com.cab.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cab.models.BillDetails;
import com.cab.models.Cab;
import com.cab.models.Customer;
import com.cab.models.TripBooking;
import com.cab.models.TripBookingDTO;
import com.cab.exceptions.CabDriverNotAvailableException;
import com.cab.exceptions.TripInProgress;
import com.cab.exceptions.UserDoesNotExist;
import com.cab.repository.CabDriverRepository;
import com.cab.repository.CustomerRepository;
import com.cab.repository.TripDetailsRepository;





@Service
public class TripBookingServiceImpl implements TripBookingServices {


    @Autowired
	private CustomerRepository customerDao;
	
	@Autowired
	private CabDriverRepository cabDriverDao;
	
	
	@Autowired
	private TripDetailsRepository tripDetailsDao;
	
	@Override
	public ResponseEntity<TripBooking> insertTripDetails(TripBookingDTO tripDto) {
		
		Customer cus= customerDao.findByUsernameAndPassword(tripDto.getUsername(),tripDto.getPassword());
		if(cus == null) throw new UserDoesNotExist("user name or password is wrong");
		
		List<TripBooking> tripDetailsList =  cus.getTripDetailsList();
		
		for(int i=0;i<tripDetailsList.size();i++) {
			if(tripDetailsList.get(i).getStatus()== false) throw new TripInProgress("Cannot Book another ... As trip is already in Progress");
			
			
		}
		
		TripBooking tripDetails = new TripBooking();
		
		tripDetails.setCustomer(cus);
		
		
		List<CabDriver> cabDriverList = cabDriverDao.findAll();
		
		CabDriver cabDriver = null;
		
		for(int i=0;i<cabDriverList.size();i++) {
			if(cabDriverList.get(i).getAvailablity()==true) 
			{
				cabDriver = cabDriverList.get(i);
				break;
			}
		}
		
		if(cabDriver==null) throw new CabDriverNotAvailableException("No Driver Available at the moment");
		
		tripDetails.setCabDriver(cabDriver);
		cabDriver.getTripDetailsList().add(tripDetails);
		cabDriver.setAvailablity(false);
		cus.getTripDetailsList().add(tripDetails);
		tripDetails.setFromLocation(tripDto.getFromLocation());
		tripDetails.setToLocation(tripDto.getToLocation());

         
        
         int min = 10;
         int max = 100;
         float distance = (float)Math.floor(Math.random()*(max-min+1)+min);
         tripDetails.setDistance(distance);
         
         
         
         
		tripDetailsDao.save(tripDetails);
		
		return new ResponseEntity<>(tripDetails,HttpStatus.ACCEPTED);
		
	}




	

}
