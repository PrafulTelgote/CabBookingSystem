package com.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab.exceptions.CustomerException;
import com.cab.models.Customer;
import com.cab.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService cService;
	
	@PostMapping("/register")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) throws CustomerException{
		
		Customer savedCustomer = cService.insertCustomer(customer);
		
		return new ResponseEntity<Customer>(savedCustomer,HttpStatus.OK);
	}
	
	@PutMapping("/customer/{uuid}")
	public ResponseEntity<Customer> updateCustomerDetails(@RequestBody Customer customer, @PathVariable("uuid") String key) throws CustomerException {
		
		Customer updatedCustomer = cService.updateCustomer(customer, key);
		
		return new ResponseEntity<Customer>(updatedCustomer,HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{id}/{uuid}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Integer id , @PathVariable("uuid") String key) throws CustomerException {
		
		Customer updatedCustomer = cService.deleteCustomer(id, key);
		
		return new ResponseEntity<Customer>(updatedCustomer,HttpStatus.OK);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers() throws CustomerException {
		
		List<Customer> customers = cService.viewCustomers();
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") Integer customerId) throws CustomerException {
		
		Customer customer = cService.viewCustomer(customerId);
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
}
