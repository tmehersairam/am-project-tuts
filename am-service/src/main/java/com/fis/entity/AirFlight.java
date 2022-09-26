package com.fis.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.validation.annotation.Validated;

@Entity
public class AirFlight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	private int airlineId;
	private String airlineName;
	private String fromLocation;
	private String toLocation;
	private String departureTime;
	private String arrivalTime;
	private int duration;
	private int totalSeats;

	public AirFlight() {
		super();
	}

	public AirFlight(int flightId, int airlineId, String airlineName, String fromLocation, String toLocation,
			String departureTime, String arrivalTime, int duration, int totalSeats) {
		super();
		this.flightId = flightId;
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.totalSeats = totalSeats;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlineId=" + airlineId + ", airlineName=" + airlineName
				+ ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", duration=" + duration + ", totalSeats=" + totalSeats + "]";
	}

	
	
}
