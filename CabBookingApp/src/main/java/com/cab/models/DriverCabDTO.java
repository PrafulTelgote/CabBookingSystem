package com.cab.models;

public class DriverCabDTO extends BasicDetails{
	
	
private String licenseNumber;
	
	private String numberPlate;
	
	private Float ratePerKms;
	
	private String carType;

	/**
	 * @return the licenseNumber
	 */
	public String getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	/**
	 * @return the numberPlate
	 */
	public String getNumberPlate() {
		return numberPlate;
	}

	/**
	 * @param numberPlate the numberPlate to set
	 */
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	/**
	 * @return the ratePerKms
	 */
	public Float getRatePerKms() {
		return ratePerKms;
	}

	/**
	 * @param ratePerKms the ratePerKms to set
	 */
	public void setRatePerKms(Float ratePerKms) {
		this.ratePerKms = ratePerKms;
	}

	/**
	 * @return the carType
	 */
	public String getCarType() {
		return carType;
	}

	/**
	 * @param carType the carType to set
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "DriverCabDTO [licenseNumber=" + licenseNumber + ", numberPlate=" + numberPlate + ", ratePerKms="
				+ ratePerKms + ", carType=" + carType + "]";
	}

	public DriverCabDTO(String licenseNumber, String numberPlate, Float ratePerKms, String carType) {
		super();
		this.licenseNumber = licenseNumber;
		this.numberPlate = numberPlate;
		this.ratePerKms = ratePerKms;
		this.carType = carType;
	}

	public DriverCabDTO() {
	}

	public static Driver findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Driver findByLicenseNumber(String licenseNumber2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
