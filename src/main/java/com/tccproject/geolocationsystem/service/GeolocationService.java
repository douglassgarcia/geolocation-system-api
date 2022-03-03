package com.tccproject.geolocationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tccproject.geolocationsystem.dto.DriverDTO;
import com.tccproject.geolocationsystem.dto.DriverMapper;
import com.tccproject.geolocationsystem.dto.LocationDTO;
import com.tccproject.geolocationsystem.dto.LocationMapper;
import com.tccproject.geolocationsystem.entity.Driver;
import com.tccproject.geolocationsystem.repository.DriverRepository;
import com.tccproject.geolocationsystem.repository.LocationRepository;

@Service
public class GeolocationService {
	
	@Autowired
	LocationRepository repositoryLocation;
	
	@Autowired
	DriverRepository repositoryDriver;
	
	/* public List<LocationDTO> saveLocations(List<LocationDTO> locations) {
		return locations;
		
	} */
	
	
	public LocationDTO saveLocation(LocationDTO location) {
		return LocationMapper.toLocationDTO(repositoryLocation.save(LocationMapper.toLocation(location)));
		
	}
	
	public DriverDTO saveDriver(DriverDTO driver) {
		return DriverMapper.toDriverDTO(repositoryDriver.save(DriverMapper.toDriver(driver)));
	}
	
	public DriverDTO getDriverById(Integer id) {
		Driver getDriver = repositoryDriver.findById(id).orElse(null);
		return DriverMapper.toDriverDTO(getDriver);
		
	}
	
	/* public List<LocationDTO> getAllLocationByIdDriver(Integer id) {
		List<Location> locations = repositoryLocation.getAllLocationByIdDriver(id);
		List<LocationDTO> locationsDTO = new ArrayList<>();
		for (Location location : locations) {
			locationsDTO.add(LocationMapper.toLocationDTO(location));
		}
		return locationsDTO;
	} */
	
	

}
