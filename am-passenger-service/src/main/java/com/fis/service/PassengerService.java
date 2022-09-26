package com.fis.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fis.entity.AirFlight;
import com.fis.entity.Passenger;
import com.fis.repository.PassengerRepository;

@Component
public class PassengerService {

	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	RestTemplate restTemplate;

	public List<AirFlight> getFlights(String from, String to) {

		Map<String, Object> values = new HashMap<String, Object>();
		values.put("from", from);
		values.put("to", to);

		return restTemplate.getForObject("http://am-service/airFlights/from/{from}/to/{to}", List.class, values);
	}

	public Passenger save(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	public Passenger update(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	public void delete(int id) {
		passengerRepository.deleteById(id);
	}

}
