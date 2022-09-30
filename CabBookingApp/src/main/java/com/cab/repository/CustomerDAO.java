package com.cab.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cab.models.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
	
	public Optional<Customer> findByCustomerMobile(String mobile);
	
}
