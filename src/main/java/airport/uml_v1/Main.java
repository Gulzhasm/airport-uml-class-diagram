package airport.uml_v1;


import airport.uml_v1.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Schedule departSchedule = new Schedule(LocalDateTime.now());
        Departure dep1 = new Departure("E345", "New York", departSchedule, new Gate("T1"));
        Arrival arr1 = new Arrival("E35", "Milano", departSchedule, new Gate("T7"));

        Airport nqz =new Airport("NQZ");
        nqz.addDeparture(dep1);
        nqz.addArrival(arr1);
        System.out.println(nqz);
    }
}