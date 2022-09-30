package com.cab.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillDetails {

	private Float ratePerKms;
	private Float distanceInKm;
	private Float totalBill;
	
}