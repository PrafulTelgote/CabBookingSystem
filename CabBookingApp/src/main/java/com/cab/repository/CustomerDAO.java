package com.cab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cab.models.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
