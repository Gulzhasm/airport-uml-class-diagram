package com.airport.entity;


import com.airport.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "departures")
public class Departure extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airport_id")
    private Airport airport;

    private String flightNumber;
    private String destination;
    @Column(columnDefinition = "DATE")
    private LocalDate date;
    @Column(columnDefinition = "TIME")
    private LocalTime time;
    private String gate;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Departure(String flightNumber, String destination, LocalDate date, LocalTime time, String gate, Status status){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.gate = gate;
        this.status = status;
    }
}
