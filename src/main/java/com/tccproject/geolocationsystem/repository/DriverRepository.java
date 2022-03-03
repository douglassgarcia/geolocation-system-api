package com.tccproject.geolocationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tccproject.geolocationsystem.entity.Driver;


@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer> {

}
