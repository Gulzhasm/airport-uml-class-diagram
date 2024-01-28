package com.airport.repository;

import com.airport.entity.Departure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightsRepository extends JpaRepository<Departure, Long> {
}
