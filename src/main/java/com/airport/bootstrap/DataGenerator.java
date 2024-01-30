package com.airport.bootstrap;

import com.airport.entity.Airport;
import com.airport.entity.Arrival;
import com.airport.entity.Departure;
import com.airport.enums.Status;
import com.airport.repository.AirportRepository;
import com.airport.repository.ArrivalRepository;
import com.airport.repository.DepartureRepository;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {//implements CommandLineRunner {
//
//    ArrivalRepository arrivalRepository;
//    DepartureRepository departureRepository;
//    AirportRepository airportRepository;
//
//
//    public DataGenerator(ArrivalRepository arrivalRepository, DepartureRepository departureRepository, AirportRepository airportRepository) {
//        this.arrivalRepository = arrivalRepository;
//        this.departureRepository = departureRepository;
//        this.airportRepository = airportRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Airport nqz = new Airport("NQZ");
//
//        Arrival a1 = new Arrival("001", "Zurich", LocalDate.now(), LocalTime.now(), "A1", Status.ON_TIME);
//        Arrival a2 = new Arrival("002", "Munich", LocalDate.now(), LocalTime.now(), "A3", Status.DELAYED);
//        Arrival a3 = new Arrival("003", "Milano", LocalDate.now(), LocalTime.now(), "A4", Status.BOARDING);
//
//        Departure d1 = new Departure("001", "Almaty", LocalDate.now(), LocalTime.now(), "A1", Status.ON_TIME);
//        Departure d2 = new Departure("002", "Munich", LocalDate.now(), LocalTime.now(), "A3", Status.BOARDING);
//        Departure d3 = new Departure("003", "Shymkent", LocalDate.now(), LocalTime.now(), "A4", Status.DELAYED);
//
//        List<Arrival> arrivals = new ArrayList<>(Arrays.asList(a1, a2, a3));
//        List<Departure> departures = new ArrayList<>(Arrays.asList(d1, d2, d3));
//
//        airportRepository.save(nqz);
//        arrivalRepository.save(a1);
//        arrivalRepository.save(a2);
//        arrivalRepository.save(a3);
//        departureRepository.save(d1);
//        departureRepository.save(d2);
//        departureRepository.save(d2);
//
//
//    }
}
