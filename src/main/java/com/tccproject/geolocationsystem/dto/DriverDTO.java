package com.tccproject.geolocationsystem.dto;

import java.util.List;

import com.tccproject.geolocationsystem.entity.Location;

public class DriverDTO {

	private int badge;
	
	private String name;
	
	private List<Location> locations;
	
	public DriverDTO(int badge, String name) {
		this.badge = badge;
		this.name = name;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
	

}
