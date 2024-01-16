package airport.uml_v1;


import airport.uml_v1.model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Departure> departureList = new ArrayList<>();
        Schedule departSchedule = new Schedule(LocalDateTime.now());
        Departure dep1 = new Departure("E345", "New York", departSchedule, new Gate("T1"));
        List<Arrival> arrivalList = new ArrayList<>();
        Arrival arr1 = new Arrival("E35", "Milano", departSchedule, new Gate("T7"));
        departureList.add(dep1);
        arrivalList.add(arr1);
        Airport nqz =new Airport("NQZ");
        nqz.addDeparture(dep1);
        nqz.addArrival(arr1);
        System.out.println(nqz);
    }
}