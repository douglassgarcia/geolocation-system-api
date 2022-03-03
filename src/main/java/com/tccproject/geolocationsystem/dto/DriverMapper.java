package com.tccproject.geolocationsystem.dto;

import com.tccproject.geolocationsystem.entity.Driver;

public class DriverMapper {
	
	public static DriverDTO toDriverDTO(Driver driver) {
		return new DriverDTO(driver.getBadge(), driver.getName());
	}
	
	public static Driver toDriver(DriverDTO driverDTO) {
		return new Driver(driverDTO.getBadge(), driverDTO.getName());
	}

}
