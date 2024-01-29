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

    private String airportCode;
    private String airportName;
    private String location;

    @OneToMany(mappedBy = "airport",fetch = FetchType.LAZY)
    private List<Arrival> arrivals;

    @OneToMany(mappedBy = "airport",fetch = FetchType.LAZY)
    private List<Departure> departures;


    public Airport(String airportCode){
        this.airportCode = airportCode;
    }
}
