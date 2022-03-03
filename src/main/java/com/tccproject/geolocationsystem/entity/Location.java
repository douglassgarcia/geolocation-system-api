package com.tccproject.geolocationsystem.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOCATION")
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int 	idLocation;
	
	private double 	latitude;
	private double 	longitude;
	private String 	dateNow;

	@ManyToOne
	@JoinColumn(name = "driver_id", nullable = false)
	private Driver driver; //Relacionamento de entidade - Muitas localizações relacionados a um motorista.
	
	
	public Location(double latitude, double longitude, String dateNow, Driver driver) {
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
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getDateNow() {
		return dateNow;
	}
	public void setDateNow(String dateNow) {
		this.dateNow = dateNow;
	}

}
