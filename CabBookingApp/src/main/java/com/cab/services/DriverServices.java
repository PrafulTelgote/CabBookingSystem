package com.cab.services;

import org.springframework.http.ResponseEntity;

import com.cab.models.Driver;
import com.cab.models.DriverCabDTO;

public interface DriverServices {
	
public ResponseEntity<Driver> insertCabDriver(DriverCabDTO cabdto);
	
	public ResponseEntity<Driver> updateCabDriver(DriverCabDTO cabdtupdate,String user,String pass);
	
	public ResponseEntity<String> deleteCabDriver(Driver cabDriver);

}
