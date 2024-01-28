package com.airport.entity;


import com.airport.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "departures")
public class Departure extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flights flight;

    private String flightNumber;
    private String destination;
    private LocalDateTime scheduledDateAndTime;
    private String gate;
    private Status status;

}
