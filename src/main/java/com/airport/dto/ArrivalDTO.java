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
public class ArrivalDTO {
    private Long id;

    private String flightNumber;
    private String origin;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime scheduledDateAndTime;
    private String gate;
    private Status status;

    public ArrivalDTO(String flightNumber, String origin, LocalDateTime scheduledDateAndTime, String gate, Status status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.scheduledDateAndTime = scheduledDateAndTime;
        this.gate = gate;
        this.status = status;
    }
}
