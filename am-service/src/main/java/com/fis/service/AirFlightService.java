package com.fis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.fis.entity.AirFlight;
import com.fis.repository.AirFlightRepository;

@Component
public class AirFlightService {

	@Autowired
	Environment environment;

	@Autowired
	AirFlightRepository airFlightRepository;

	public AirFlight save(AirFlight airFlight) {
		return airFlightRepository.save(airFlight);
	}

	public List<AirFlight> getAll() {

		return airFlightRepository.findAll();
	}

	public AirFlight get(int id) {

		return airFlightRepository.findById(id).orElseThrow(() -> new RuntimeException("No data with + " + id));
	}

	public AirFlight update(int id, AirFlight airFlight) {
		get(id);

		return airFlightRepository.save(airFlight);

	}

	public void delete(int id) {
		get(id);
		airFlightRepository.deleteById(id);

	}

	public List<AirFlight> getAllByFilter(String from, String to) {
		System.out.println(environment.getProperty("local.server.port"));

		return airFlightRepository.findByFromLocationAndToLocation(from, to);
	}
}
