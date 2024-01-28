package com.airport.dto;



import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AirportDTO {
    private final String airportCode;
    private List<DepartureDTO> departureList;
    private List<ArrivalDTO> arrivalList;

    public AirportDTO(String airportCode){
        this.airportCode = airportCode;
        departureList = new ArrayList<>();
        arrivalList = new ArrayList<>();
    }

    public String getAirportCode(){
        return airportCode;
    }

    public List<ArrivalDTO> getArrivalList(){
        return arrivalList;
    }


    public void addDeparture(DepartureDTO departure){
        departureList.add(departure);
    }

    public void addArrival(ArrivalDTO arrival){
        arrivalList.add(arrival);
    }

}
