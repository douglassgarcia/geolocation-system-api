package com.tccproject.geolocationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tccproject.geolocationsystem.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{
	

}
