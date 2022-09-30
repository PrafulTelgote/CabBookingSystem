package com.cab.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cab.exceptions.UserDoesNotExist;
import com.cab.exceptions.UserNameAlreadyExist;
import com.cab.models.Driver;
import com.cab.models.DriverCabDTO;

public interface DriverServices {
	
public ResponseEntity<Driver> insertCabDriver(DriverCabDTO cabdto) throws UserNameAlreadyExist;
	
	public ResponseEntity<Driver> updateCabDriver(DriverCabDTO cabdtupdate,String user,String pass) throws UserNameAlreadyExist, UserDoesNotExist;
	
//	public ResponseEntity<String> deleteCabDriver(Integer id);

//	public ResponseEntity<Driver> viewDriverbyId(Integer id);
	
//	public ResponseEntity<List<Driver>> viewBestDriver();
}
