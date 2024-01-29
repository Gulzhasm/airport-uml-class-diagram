package com.airport.service.impl;

import com.airport.dto.ArrivalDTO;
import com.airport.dto.DepartureDTO;
import com.airport.entity.Arrival;
import com.airport.entity.Departure;
import com.airport.mapper.AirportMapper;
import com.airport.mapper.ArrivalMapper;
import com.airport.mapper.DepartureMapper;
import com.airport.repository.AirportRepository;
import com.airport.repository.ArrivalRepository;
import com.airport.repository.DepartureRepository;
import com.airport.service.AirportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    @Override
    public List<ArrivalDTO> listAllArrivals() {
        return null;
    }

    @Override
    public List<DepartureDTO> listAllDepartures() {
        return null;
    }

}
