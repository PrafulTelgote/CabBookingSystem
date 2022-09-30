package com.cab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cab.exceptions.UserDoesNotExist;
import com.cab.exceptions.UserNameAlreadyExist;
import com.cab.models.Cab;
import com.cab.models.Driver;
import com.cab.models.DriverCabDTO;
import com.cab.repository.DriverDao;

@Service
public class DriverServiceImpl implements DriverServices {
	
	@Autowired
	private DriverDao dao;
	
	@Override
	public ResponseEntity<Driver> insertCabDriver(DriverCabDTO cabdto) throws UserNameAlreadyExist {
		Cab cab = new Cab();
		cab.setCarType(cabdto.getCarType());
		cab.setNumberPlate(cabdto.getNumberPlate());
		cab.setRatePerKms(cabdto.getRatePerKms());
		
		Driver cabDriver = new Driver();
		cabDriver.setAddress(cabdto.getAddress());
		cabDriver.setUsername(cabdto.getUsername());
		cabDriver.setPassword(cabdto.getPassword());
		cabDriver.setMobile(cabdto.getMobile());
		cabDriver.setEmail(cabdto.getEmail());
		cabDriver.setCab(cab);
		cabDriver.setLicenseNumber(cabdto.getLicenseNumber());
		
		System.out.println(cabDriver);
		cab.setCabDriver(cabDriver);
		
		Driver cd = DriverCabDTO.findByUsername(cabdto.getUsername());
		Driver cd2 = DriverCabDTO.findByLicenseNumber(cabdto.getLicenseNumber());
		if(cd != null) throw new UserNameAlreadyExist("Username Already Exist");
		if(cd2 != null) throw new UserNameAlreadyExist("License number already registered");
		
		Cab cb = dao.findByNumberPlate(cabdto.getNumberPlate());
		if(cb != null) throw new UserNameAlreadyExist("Number Plate already registered");
		dao.save(cabDriver);
		return new ResponseEntity<>(cabDriver,HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<Driver> updateCabDriver(DriverCabDTO cabdto, String user, String pass) throws UserNameAlreadyExist, UserDoesNotExist {
		// TODO Auto-generated method stub
  Driver cd = dao.findByUsernameAndPassword(user,pass);
		
		if(cd == null) throw new UserDoesNotExist("Username or Password is wrong");
		
		Cab cb = cd.getCab();
		System.out.println(cb);
		System.out.println(cabdto);
		
		if(cabdto.getUsername() != null) {
			Driver cd2 = dao.findByUsername(cabdto.getUsername());
			if(cd2 != null) throw new UserNameAlreadyExist("username already exist");
			cd.setUsername(cabdto.getUsername());
		}
		if(cabdto.getPassword() != null) cd.setPassword(cabdto.getPassword());
		if(cabdto.getMobile() != null) cd.setMobile(cabdto.getMobile());
		if(cabdto.getAddress() != null) cd.setAddress(cabdto.getAddress());
		if(cabdto.getLicenseNumber() != null) {
			Driver cd2 = DriverDao.findByLicenseNumber(cabdto.getLicenseNumber());
			if(cd2 != null) throw new UserNameAlreadyExist("License number already exist");
		}
		
		if(cabdto.getEmail() != null) cd.setEmail(cabdto.getEmail());
//		if(cabdto.get)
		
		if(cabdto.getCarType() != null) cb.setCarType(cabdto.getCarType());
		if(cabdto.getNumberPlate() != null) {
			Cab cb2 = dao.findByNumberPlate(cabdto.getNumberPlate());
			if(cb2 != null) throw new UserNameAlreadyExist("Number Plate already registered");
			cb.setNumberPlate(cabdto.getNumberPlate());;
		}
		if(cabdto.getRatePerKms() != null) cb.setRatePerKms(cabdto.getRatePerKms());
		
		dao.save(cd);
		
		
		return new ResponseEntity<Driver>(cd,HttpStatus.OK); 
	}

}
