package airport.uml_v2;


import airport.uml_v2.model.*;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        Departure dep1 = new Departure("ER35", "Zurich",  LocalDateTime.now(), "G01", Status.DELAYED );
        Departure dep = new Departure("ER355", "Zurich",  LocalDateTime.now(), "G01", Status.DELAYED );
        Arrival arr = new Arrival("EP987",  "Male", LocalDateTime.now(),"G07",  Status.ON_TIME );


        Airport astana = new Airport("NQZ");
        astana.addArrival(arr);
        astana.addDeparture(dep);
        astana.addDeparture(dep1);
        System.out.println(astana);

        System.out.println(astana.getArrivalList().get(0).getFlightNumber());

    }
}
