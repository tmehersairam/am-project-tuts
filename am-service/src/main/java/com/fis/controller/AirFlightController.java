package com.fis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.entity.AirFlight;
import com.fis.service.AirFlightService;

@RestController
public class AirFlightController {

	@Autowired
	AirFlightService airFlightService;

	@GetMapping("/airFlights/{id}")
	public ResponseEntity<AirFlight> get(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(airFlightService.get(id), HttpStatus.OK);
	}

	@GetMapping("/airFlights")
	public ResponseEntity<List<AirFlight>> getAll() {
		return new ResponseEntity<>(airFlightService.getAll(), HttpStatus.OK);
	}

	@GetMapping("/airFlights/from/{from}/to/{to}")
	public ResponseEntity<List<AirFlight>> getAllByFromAndTo(@PathVariable(value = "from") String from,
			@PathVariable(value = "to") String to) {
		return new ResponseEntity<>(airFlightService.getAllByFilter(from, to), HttpStatus.OK);
	}

	@PostMapping("/airFlights")
	public ResponseEntity<AirFlight> createAirFlight(@RequestBody AirFlight airFlight) {
		return new ResponseEntity<>(airFlightService.save(airFlight), HttpStatus.CREATED);
	}

	@PutMapping("/airFlights/{id}")
	public ResponseEntity<AirFlight> modifyAirFlight(@PathVariable(value = "id") int id,
			@RequestBody AirFlight airFlight) {

		return new ResponseEntity<>(airFlightService.update(id, airFlight), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/airFlights/{id}")
	public ResponseEntity<String> deleteAirFlight(@PathVariable(value = "id") int id) {
		airFlightService.delete(id);
		return new ResponseEntity<>("Delete", HttpStatus.NO_CONTENT);
	}

}
