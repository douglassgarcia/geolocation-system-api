package com.tccproject.geolocationsystem.dto;

import com.tccproject.geolocationsystem.entity.Location;

public class LocationMapper {
	
	public static LocationDTO toLocationDTO(Location location) {
		return new LocationDTO(
				location.getLatitude(),
				location.getLongitude(),
				location.getDateNow(),
				DriverMapper.toDriverDTO(location.getDriver())
				);
	}
	
	public static Location toLocation(LocationDTO locationDTO) {
		return new Location(
				locationDTO.getLatitude(), 
				locationDTO.getLongitude(), 
				locationDTO.getDateNow(), 
				DriverMapper.toDriver(locationDTO.getDriver())
				);
	}

}
