package com.fis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.entity.AirFlight;
import com.fis.entity.Passenger;
import com.fis.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	PassengerService passengerService;

	@GetMapping("/getFlights/from/{from}/to/{to}")
	public ResponseEntity<List<AirFlight>> getFlights(@PathVariable(value = "from") String from,
			@PathVariable(value = "to") String to) {
		return new ResponseEntity<>(passengerService.getFlights(from, to), HttpStatus.OK);
	}

	@GetMapping("/passenger")
	public ResponseEntity<Passenger> register(@RequestBody Passenger passenger) {
		return new ResponseEntity<>(passengerService.save(passenger), HttpStatus.CREATED);
	}

	@PutMapping("/passenger/{id}")
	public ResponseEntity<Passenger> update(@PathVariable(value = "id") int id, @RequestBody Passenger passenger) {
		return new ResponseEntity<>(passengerService.update(passenger), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/passenger/{id}")
	public ResponseEntity<String> delete(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>("Delete", HttpStatus.NO_CONTENT);
	}

}
