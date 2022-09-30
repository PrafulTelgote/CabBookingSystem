package com.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cab.exceptions.UserDoesNotExist;
import com.cab.exceptions.UserNameAlreadyExist;
import com.cab.models.Driver;
import com.cab.models.DriverCabDTO;
import com.cab.services.DriverServices;

@RestController
public class DriverController {
	
	
	@Autowired
	private DriverServices cabDriverService;
	
//	@Autowired
//	private TripDetailsService tripDetailsService;
	
	@PostMapping("/create")
	public ResponseEntity<Driver> insertCabDriverHandler(@RequestBody DriverCabDTO cabdto) throws UserNameAlreadyExist{
		
		return cabDriverService.insertCabDriver(cabdto);
	}
	@PutMapping("/update")
	public ResponseEntity<Driver> updateCabDriverHandler(@RequestBody DriverCabDTO cabdto,@RequestParam String user,@RequestParam String pass) throws UserNameAlreadyExist, UserDoesNotExist{
		
		return cabDriverService.updateCabDriver(cabdto,user,pass);
	}

}
