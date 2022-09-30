package com.cab.services;

import java.util.List;

import com.cab.exceptions.CustomerException;
import com.cab.models.Customer;

public interface CustomerService {
	
	public Customer insertCustomer(Customer customer) throws CustomerException;
	
	public Customer updateCustomer(Customer customer, String key) throws CustomerException;
	
	public Customer deleteCustomer(Integer customerId, String key) throws CustomerException;
	
	public List<Customer> viewCustomers() throws CustomerException;
	
	public Customer viewCustomer(Integer customerId) throws CustomerException;
	
	public Customer validateCustomer(String userName, String password);
	
}
