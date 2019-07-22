import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aircraft airplane1 = new Airplane("AIR1", "747", "Boeing", 100, "GOL");
        Aircraft airplane2 = new Airplane("AIR2", "474", "Boeing", 50, "TAM");
        Aircraft helicopter1 = new Helicopter("H1", "1557", "Ford", Helicopter.HelicopterType.RESCUE);
        Aircraft helicopter2 = new Helicopter("H2", "1537", "Ford", Helicopter.HelicopterType.AIR_TAXI);

        City city1 = new City("RJ", 1000);
        City city2 = new City("SP", 2000);

        Airport airport1 = new Airport("SDU", "Santos Dumont", city1, false);
        Airport airport2 = new Airport("TJB", "Tom Jobim", city1, true);
        Airport airport3 = new Airport("GRU", "Guarulhos", city2, true);

        Flight flight1 = new Flight(123, "23/01/2019", "09:20", "23/01/2019", "10:00", 100, airport1, airport2, airplane1);
        Flight flight2 = new Flight(456, "24/01/2019", "09:20", "24/01/2019", "10:00", 50, airport2, airport1, airplane2);

        airport1.addFlight(flight1);
        airport2.addFlight(flight2);

        System.out.println(airport1.equals(airport2));

        System.out.println(city1.equals(city2));

        System.out.println(flight1.equals(flight2));

        airport1.addAircraftToCourtyard(airplane1);
        airport1.addAircraftToCourtyard(helicopter1);

        System.out.println(airport1.isAircraftInCourtyard(helicopter1.getPrefix()));

        System.out.println(airport1.hasRoute(airport2));

        System.out.println(airport1.getFlights(city1, city2, "23/01/2019"));
    }
}
