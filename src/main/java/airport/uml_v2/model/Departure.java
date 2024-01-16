package airport.uml_v2.model;

import java.time.LocalDateTime;

public class Departure extends Flight {
    private String destination;

    public Departure(String flightNumber, String destination, LocalDateTime scheduledDateAndTime, String gate, Status status) {
        super(flightNumber, scheduledDateAndTime, gate, status);
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }
    @Override
    public String toString() {
        return super.toString() + " and destination=" + destination;
    }
}
