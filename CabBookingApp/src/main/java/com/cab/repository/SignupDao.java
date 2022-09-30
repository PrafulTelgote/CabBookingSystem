package com.cab.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cab.models.SignupDetails;

@Repository
public interface SignupDao extends JpaRepository<SignupDetails,Integer> {
	
	public Optional<SignupDetails> findByUserName(String userName);

}
