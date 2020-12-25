package com.sidorin.hibernate_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sidorin.hibernate_demo.domain.Location;
import com.sidorin.hibernate_demo.service.LocationService;



@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/location")
	public List<Location> getAllLocations() {
		return (List<Location>) locationService.findAll();
	}

	@GetMapping("/location/{id}")
	public Optional<Location> getLocationById(Long id) {
		return locationService.findById(id);
	}

	
	
	

}
