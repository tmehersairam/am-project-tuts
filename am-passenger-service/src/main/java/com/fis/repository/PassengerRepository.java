package com.fis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
