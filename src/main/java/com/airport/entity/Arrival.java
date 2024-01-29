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
@Table(name = "arrivals")
public class Arrival extends BaseEntity {

    @ManyToOne
    private Airport airport;

    private String flightNumber;
    private String origin;
    @Column(columnDefinition = "DATE")
    private LocalDate date;
    @Column(columnDefinition = "TIME")
    private LocalTime time;
    private String gate;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Arrival(String flightNumber, String origin, LocalDate date, LocalTime time, String gate, Status status){
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.date = date;
        this.time = time;
        this.gate = gate;
        this.status = status;
    }


}
