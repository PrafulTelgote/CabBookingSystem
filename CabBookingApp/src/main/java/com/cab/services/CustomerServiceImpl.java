package com.cab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.exceptions.CustomerException;
import com.cab.models.Customer;
import com.cab.repository.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDAO cDAO;

	@Override
	public Customer insertCustomer(Customer customer) throws CustomerException {
		
		Optional<Customer> existCustomer = cDAO.findByCustomerMobile(customer.getMobile());
		
		if(existCustomer.isPresent())
			throw new CustomerException("User Already Exists.");
		else
			return cDAO.save(customer);
		
	}

	@Override
	public Customer updateCustomer(Customer customer, String key) throws CustomerException {
		
		return null;
	}

	@Override
	public Customer deleteCustomer(Integer customerId, String key) throws CustomerException {
		
		return null;
	}

	@Override
	public List<Customer> viewCustomers() throws CustomerException{
		
		List<Customer> customers = cDAO.findAll();
		
		if(customers.size() > 0) 
			return customers;
		else 
			throw new CustomerException("No Customers exists.");
		
	}

	@Override
	public Customer viewCustomer(Integer customerId) throws CustomerException {
		
		Optional<Customer> customer = cDAO.findById(customerId);
		
		if(customer.isPresent()) return customer.get();
		else throw new CustomerException("User Not Found by Given Id");
		
	}

	@Override
	public Customer validateCustomer(String userName, String password) {
		
		
		return null;
	}
}
