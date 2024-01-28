package com.airport.service;


import com.airport.dto.ArrivalDTO;
import com.airport.dto.DepartureDTO;

import java.util.List;

public interface AirportService {

    List<ArrivalDTO> listAllArrivals();
    List<DepartureDTO> listAllDepartures();



}
