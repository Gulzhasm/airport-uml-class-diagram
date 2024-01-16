package airport.uml_v1.model;

public class Arrival {
    private String flightNumber;
    private String origin;
    private Schedule schedule;
    private Gate gateNumber;


    public Arrival(String flightNumber, String origin, Schedule schedule, Gate gateNumber) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.schedule = schedule;
        this.gateNumber = gateNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Gate getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Gate gateNumber) {
        this.gateNumber = gateNumber;
    }

    @Override
    public String toString() {
        return "Arrival{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", schedule=" + schedule +
                ", gateNumber=" + gateNumber +
                '}';
    }
}
