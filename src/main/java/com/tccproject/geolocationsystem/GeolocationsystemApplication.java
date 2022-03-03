package com.tccproject.geolocationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tccproject.geolocationsystem.repository")
// @EnableJpaRepositories (basePackageClasses = {DriverRepository.class})
public class GeolocationsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeolocationsystemApplication.class, args);
	}

}
