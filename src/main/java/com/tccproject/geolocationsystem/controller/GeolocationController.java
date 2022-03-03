package com.tccproject.geolocationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tccproject.geolocationsystem.dto.DriverDTO;
import com.tccproject.geolocationsystem.dto.LocationDTO;
import com.tccproject.geolocationsystem.service.GeolocationService;

@RestController
@RequestMapping("/geolocation")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GeolocationController {
	
	@Autowired
	private GeolocationService service;
	
	/*@PostMapping(path = "", consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<LocationDTO>> saveLocations(@Validated @RequestBody List<LocationDTO> locations) {
		List<LocationDTO> locationlist = service.saveLocations(locations);
		return  ResponseEntity.status(HttpStatus.CREATED).body(locationlist);
	}*/
	
	@PostMapping(path = "/location", consumes = "application/json", produces = "application/json")
	public ResponseEntity<LocationDTO> saveLocation(@Validated @RequestBody LocationDTO location) {
		LocationDTO locationObject = service.saveLocation(location);
		return  ResponseEntity.status(HttpStatus.CREATED).body(locationObject);
	}
	
	@PostMapping(path = "/driver", consumes = "application/json", produces = "application/json")
	public ResponseEntity<DriverDTO> saveDriver(@Validated @RequestBody DriverDTO driver) {
		DriverDTO driverObject = service.saveDriver(driver);
		return  ResponseEntity.status(HttpStatus.CREATED).body(driverObject);
	}
	
	@GetMapping("/driver/{id}")
	public ResponseEntity<DriverDTO> getLocationById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getDriverById(id));
	}
	
	/* @GetMapping("/location/{id}")
	public ResponseEntity<List<LocationDTO>> getAllLocationByIdDriver(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getAllLocationByIdDriver(id));
	} */


}
