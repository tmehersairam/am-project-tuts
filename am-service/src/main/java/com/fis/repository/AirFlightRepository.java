package com.fis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.entity.AirFlight;

public interface AirFlightRepository extends JpaRepository<AirFlight, Integer> {
	
	public List<AirFlight> findByFromLocationAndToLocation(String fromLocation, String toLocation);
	
	
}
