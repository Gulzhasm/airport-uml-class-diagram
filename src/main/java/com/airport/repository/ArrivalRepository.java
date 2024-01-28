package com.airport.repository;

import com.airport.entity.Arrival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArrivalRepository extends JpaRepository<Arrival, Long> {
}
