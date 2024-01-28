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
import java.util.stream.Collectors;

@Service
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;
    private final ArrivalRepository arrivalRepository;
    private final AirportMapper airportMapper;
    private final ArrivalMapper arrivalMapper;
    private final DepartureMapper departureMapper;
    private final DepartureRepository departureRepository;

    public AirportServiceImpl(AirportRepository airportRepository, ArrivalRepository arrivalRepository, AirportMapper airportMapper, ArrivalMapper arrivalMapper, DepartureMapper departureMapper, DepartureRepository departureRepository) {
        this.airportRepository = airportRepository;
        this.arrivalRepository = arrivalRepository;
        this.airportMapper = airportMapper;
        this.arrivalMapper = arrivalMapper;
        this.departureMapper = departureMapper;
        this.departureRepository = departureRepository;
    }


    @Override
    public List<ArrivalDTO> listAllArrivals() {
        List<Arrival> list = arrivalRepository.findAll();
        return list.stream().map(arrivalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<DepartureDTO> listAllDepartures() {
        List<Departure> list = departureRepository.findAll();
        return list.stream().map(departureMapper::convertToDto).collect(Collectors.toList());
    }

}
