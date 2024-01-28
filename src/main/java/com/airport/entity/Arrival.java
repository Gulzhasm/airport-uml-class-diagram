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
@Table(name = "arrivals")
public class Arrival extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "flights_id")
    private Flights flight;

    private String flightNumber;
    private String origin;
    @Column(columnDefinition = "DATE")
    private LocalDateTime scheduledDateAndTime;
    private String gate;
    private Status status;



}
