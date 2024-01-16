package airport.uml_v2.model;



import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String airportCode;
    private List<Departure> departureList;
    private List<Arrival> arrivalList;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        departureList = new ArrayList<>();
        arrivalList = new ArrayList<>();
    }

    public String getAirportCode(){
        return airportCode;
    }

    public List<Arrival> getArrivalList(){
        return arrivalList;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportCode='" + airportCode + '\'' +
                ", departureList=" + departureList +
                ", arrivalList=" + arrivalList +
                '}';
    }

    public void addDeparture(Departure departure){
        departureList.add(departure);
    }

    public void addArrival(Arrival arrival){
        arrivalList.add(arrival);
    }

}
