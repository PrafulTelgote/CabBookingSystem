package com.cab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cab.models.TripBooking;

@Repository
public interface TripDetailsRepository extends JpaRepository<TripBooking, Integer>{

}
