package com.cab.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cab.models.Driver;
import com.cab.models.DriverCabDTO;

@Service
public class DriverServiceImpl implements DriverServices {

	@Override
	public ResponseEntity<Driver> insertCabDriver(DriverCabDTO cabdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Driver> updateCabDriver(DriverCabDTO cabdtupdate, String user, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deleteCabDriver(Driver cabDriver) {
		// TODO Auto-generated method stub
		return null;
	}

}
