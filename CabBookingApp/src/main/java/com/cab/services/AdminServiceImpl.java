package com.cab.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.exceptions.AdminException;
import com.cab.models.Admin;
import com.cab.repository.AdminDao;
import com.cab.repository.CustomerDAO;

@Service
public class AdminServiceImpl implements AdminServices {

	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	
	@Override
	public Admin insertAdmin(Admin admin) {
		
		return adminDao.save(admin);
		
	}

	@Override
	public Admin updateAdmin(Admin admin) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin deleteAdmin(Integer adminId) throws AdminException {
		
		Optional<Admin> op = adminDao.findById(adminId);
		
		if(op.isPresent()) {
			Admin adm = op.get();
			
			adminDao.delete(adm);
			
			return adm;
		}else {
			throw new AdminException("Admin doesn't exist for ID: "+adminId);
		}
		
	}

}
