package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.DTO.AdminDTO;
import com.masai.DTO.LoginDTO;
import com.masai.model.Admin;
import com.masai.model.AdminSession;
import com.masai.model.CompletedTrips;
import com.masai.model.Customer;
import com.masai.model.Driver;
import com.masai.service.AdminService;
import com.masai.service.LoginService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private LoginService loginService;

	@Autowired
	AdminService adminService;

	@PostMapping("/register")
	public Admin registerAdmin(@RequestBody Admin admin) {
		return adminService.adminRegister(admin);

	}
	
	@GetMapping("/login")
	public ResponseEntity<AdminSession> loginAdmin(@RequestBody LoginDTO dto) {
		return new ResponseEntity<>(loginService.loginAdmin(dto), HttpStatus.ACCEPTED);
	}

	@PatchMapping("/update/{username}")
	public Admin updateAdminPassword(@RequestBody AdminDTO dto, @PathVariable("username") String username,
			@RequestParam String key) {
		return adminService.updatePassword(dto, username, key);
	}

	@PutMapping("/update/{username}")
	public Admin updateAdmin(@RequestBody Admin admin, @PathVariable("username") String username,
			@RequestParam String key) {
		return adminService.update(admin, username, key);
	}

	@DeleteMapping("/delete")
	public String deleteAdmin(@RequestBody AdminDTO dto, @RequestParam String key) {
		return adminService.deleteByUsername(dto, key);

	}

	@GetMapping("/logout")
	public String logoutAdmin(@RequestParam String key) {

		return adminService.logoutAdmin(key);

	}

	@GetMapping("/listoftripsbycustomer")
	public List<CompletedTrips> listOfAllTripsByCustomer(@RequestParam Integer customerId, @RequestParam String key) {
		return adminService.getTripsByCustomerId(customerId, key);

	}

	@GetMapping("/listoftrips")
	public List<CompletedTrips> listOfAllTrips(@RequestParam String key) {
		return adminService.getAllTrips(key);
	}

	@GetMapping("/listofcustomers")
	public List<Customer> listOfCustomers(@RequestParam String key) {

		List<Customer> listOfCustomers = adminService.getListOfCustomers(key);

		return listOfCustomers;
	}

	@GetMapping("/listofdrivers")
	public List<Driver> listOfDrivers(@RequestParam String key) {

		List<Driver> listOfDrivers = adminService.getListOfDrivers(key);

		return listOfDrivers;
	}

}
