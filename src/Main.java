import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Airport airport = Airport.getInstance();
        Date date = new Date(System.currentTimeMillis()+120*1000*60);

        airport.getTerminals()
                .forEach(terminal -> terminal
                        .getFlights()
                        .stream()
                        .filter(flight -> flight.getDate().before(date))
                        .filter(flight -> flight.getDate().after(new Date()))
                        .forEach(System.out::println));

    }
}