package com.airport.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@Entity
@NoArgsConstructor
@Data
@Table(name = "airports")
public class Airport extends BaseEntity {
    public Airport(String airportCode, String airportName, String location) {
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.location = location;
    }

    private String airportCode;
    private String airportName;
    private String location;

    @OneToMany(mappedBy = "airport",fetch = FetchType.LAZY)
    private List<Arrival> arrivals;

    @OneToMany(mappedBy = "airport",fetch = FetchType.LAZY)
    private List<Departure> departures;



}
