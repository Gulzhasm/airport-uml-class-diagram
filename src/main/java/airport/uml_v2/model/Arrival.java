package airport.uml_v2.model;

import java.time.LocalDateTime;

public class Arrival extends Flight{
     private String origin;

    public Arrival(String flightNumber,String origin, LocalDateTime scheduledDateAndTime, String gate, Status status) {
        super(flightNumber, scheduledDateAndTime, gate, status);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return super.toString() + " and origin=" + origin;
    }
}
