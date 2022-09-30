package com.cab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.models.Cab;
import com.cab.models.Driver;

public interface DriverDao extends JpaRepository<Driver, Integer> {

	Cab findByNumberPlate(String numberPlate);

	Driver findByUsernameAndPassword(String user, String pass);

	Driver findByUsername(String username);

	static Driver findByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
