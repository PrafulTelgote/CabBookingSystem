package com.cab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.repository.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDAO cDAO;

}
