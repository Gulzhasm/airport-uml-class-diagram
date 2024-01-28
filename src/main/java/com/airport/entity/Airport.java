package com.airport.entity;


import jakarta.persistence.*;
import lombok.*;



@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "airport")
public class Airport extends BaseEntity {

    private String airportCode;
    private String airportName;
    private String location;
    @ManyToOne
    @JoinColumn(name = "flights_id")
    private Flights flights_id;

    public Airport(String airportCode){
        this.airportCode = airportCode;
    }
}
