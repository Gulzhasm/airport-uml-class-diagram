package com.airport.dto;

import com.airport.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartureDTO {

    private long id;
    private String flightNumber;
    private String destination;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime scheduledDateAndTime;
    private String gate;
    private Status status;

    public DepartureDTO(String flightNumber, String destination, LocalDateTime scheduledDateAndTime, String gate, Status status) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDateAndTime = scheduledDateAndTime;
        this.gate = gate;
        this.status = status;
    }
}
