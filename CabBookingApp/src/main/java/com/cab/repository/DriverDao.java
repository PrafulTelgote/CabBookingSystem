package com.cab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.models.Cab;
import com.cab.models.Driver;

public interface DriverDao extends JpaRepository<Driver, Integer> {

	Cab findByNumberPlate(String numberPlate);

}
