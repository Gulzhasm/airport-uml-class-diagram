package airport.uml_v1.model;

public class Departure {
    private String flightNumber;
    private String destination;
    private Schedule scheduledTime;
    private Gate gateNumber;

    public Departure(String flightNumber, String destination, Schedule scheduledTime, Gate gateNumber) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledTime = scheduledTime;
        this.gateNumber = gateNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Schedule getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Schedule scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Gate getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Gate gateNumber) {
        this.gateNumber = gateNumber;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", scheduledTime=" + scheduledTime +
                ", gateNumber=" + gateNumber +
                '}';
    }
}
