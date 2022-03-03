package com.tccproject.geolocationsystem.dto;

public class LocationDTO {
	
	private double 	latitude;
	private double 	longitude;
	private String 	dateNow;

	private DriverDTO driver;
	
	
	public LocationDTO(double latitude, double longitude, String dateNow, DriverDTO driver) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.dateNow = dateNow;
		this.driver = driver;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public String getDateNow() {
		return dateNow;
	}


	public void setDateNow(String dateNow) {
		this.dateNow = dateNow;
	}


	public DriverDTO getDriver() {
		return driver;
	}


	public void setDriver(DriverDTO driver) {
		this.driver = driver;
	}


}
