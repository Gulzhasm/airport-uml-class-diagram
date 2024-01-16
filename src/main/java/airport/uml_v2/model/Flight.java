package airport.uml_v2.model;

import java.time.LocalDateTime;

public class Flight {

    private String flightNumber;
    private LocalDateTime scheduledDateAndTime;
    private String gate;
    private Status status;

    public Flight(String flightNumber, LocalDateTime scheduledDateAndTime, String gate, Status status) {
        this.flightNumber = flightNumber;
        this.scheduledDateAndTime = scheduledDateAndTime;
        this.gate = gate;
        this.status = status;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalDateTime getScheduledDateAndTime() {
        return scheduledDateAndTime;
    }

    public void setScheduledDateAndTime(LocalDateTime scheduledDateAndTime) {
        this.scheduledDateAndTime = scheduledDateAndTime;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", scheduledDateAndTime=" + scheduledDateAndTime +
                ", gate='" + gate + '\'' +
                ", status=" + status +
                '}';
    }
}
