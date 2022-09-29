package com.cab.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Cab extends BasicDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cabId;
	
	@NotNull(message = "Number Plate cannot be null")
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}",message = "Number Plate should be in format of MH23BC5678")
	private String numberPlate;
	
	@NotNull(message = "Car type cannot be null")
	private String carType;
	
	@NotNull(message = "Rate cannot be null")
	private Float ratePerKms;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "driverID")
	private Driver cabDriver;

	/**
	 * @return the cabId
	 */
	public Integer getCabId() {
		return cabId;
	}

	/**
	 * @param cabId the cabId to set
	 */
	public void setCabId(Integer cabId) {
		this.cabId = cabId;
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
	 * @return the cabDriver
	 */
	public Driver getCabDriver() {
		return cabDriver;
	}

	/**
	 * @param cabDriver the cabDriver to set
	 */
	public void setCabDriver(Driver cabDriver) {
		this.cabDriver = cabDriver;
	}

	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", numberPlate=" + numberPlate + ", carType=" + carType + ", ratePerKms="
				+ ratePerKms + ", cabDriver=" + cabDriver + "]";
	}

	public Cab(Integer cabId,
			@NotNull(message = "Number Plate cannot be null") @Pattern(regexp = "[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}", message = "Number Plate should be in format of MH23BC5678") String numberPlate,
			@NotNull(message = "Car type cannot be null") String carType,
			@NotNull(message = "Rate cannot be null") Float ratePerKms, Driver cabDriver) {
		super();
		this.cabId = cabId;
		this.numberPlate = numberPlate;
		this.carType = carType;
		this.ratePerKms = ratePerKms;
		this.cabDriver = cabDriver;
	}

	public Cab() {
		super();
	}
	
	
	
	
	
	

}
