package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String airportCode;
    private List<Departure> departures;
    private List<Arrival> arrivals;

    public Airport(String airportCode) {
        this.airportCode = airportCode;
        departures = new ArrayList<>();
        arrivals = new ArrayList<>();
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void addDeparture(Departure departure) {
        departures.add(departure);
    }

    public void addArrival(Arrival arrival) {
        arrivals.add(arrival);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportCode='" + airportCode + '\'' +
                ", departures=" + departures.get(0) +
                ", arrivals=" + arrivals.get(0) +
                '}';
    }
}
