package com.tccproject.geolocationsystem.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DRIVER")
public class Driver implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	private int badge;
	
	private String name;
	
	@OneToMany(mappedBy = "driver")
	private List<Location> locations; //Um motorista para várias localizações
	
	public Driver(int badge, String name) {
		this.badge = badge;
		this.name = name;
	}
	
	public Driver() {
		
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
