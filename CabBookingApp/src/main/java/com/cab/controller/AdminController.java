package com.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cab.exceptions.AdminException;
import com.cab.models.Admin;
import com.cab.services.AdminServices;

@RestController
public class AdminController {

	@Autowired
	private AdminServices adminServices;
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> createAdminHandler(@RequestBody Admin admin){
		
		Admin adm = adminServices.insertAdmin(admin);
		
		return new ResponseEntity<Admin>(adm, HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/admin")
	public ResponseEntity<Admin> updateAdminHandler(@RequestBody Admin admin) throws AdminException{
		
		Admin adm = adminServices.updateAdmin(admin);
		
		return new ResponseEntity<Admin>(adm, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<Admin> deleteAdminHandler(@PathVariable("id")Integer adminId) throws AdminException{
		
		Admin adm = adminServices.deleteAdmin(adminId);
		
		return new ResponseEntity<Admin>(adm, HttpStatus.OK);
		
	}
	
}
