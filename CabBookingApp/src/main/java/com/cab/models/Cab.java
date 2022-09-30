package com.cab.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cab {
	
	private Integer cabId;
	private String cabType;
	private Float pkmr;

}
