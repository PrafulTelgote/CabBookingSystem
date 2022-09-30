package com.cab.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cab.models.CurrentSessionDetails;

public interface CurrentSessionDao extends JpaRepository<CurrentSessionDetails,Integer> {	
	public Optional<CurrentSessionDetails> findByUserId(Integer userId);
	
	public Optional<CurrentSessionDetails> findByUuid(String uuid);
}
