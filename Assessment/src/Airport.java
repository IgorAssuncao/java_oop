import java.util.ArrayList;

public class Airport {
    private String code;
    private String name;
    private City city;
    private boolean international;
    private ArrayList<Airport> departureAirports;
    private ArrayList<Airport> destinationAirports;
    private ArrayList<Aircraft> aircraftsInCourtyard;
    private ArrayList<Flight> flights;

    public Airport(String code, String name, City city, boolean international) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.departureAirports = new ArrayList<>();
        this.destinationAirports = new ArrayList<>();;
        this.aircraftsInCourtyard = new ArrayList<>();;
        this.international = international;

        this.flights = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public ArrayList<Airport> getDepartureAirports() {
        return departureAirports;
    }

    public void setDepartureAirports(ArrayList<Airport> originAirports) {
        this.departureAirports = originAirports;
    }

    public ArrayList<Airport> getDestinationAirports() {
        return destinationAirports;
    }

    public void setDestinationAirports(ArrayList<Airport> destinationAirports) {
        this.destinationAirports = destinationAirports;
    }

    public ArrayList<Aircraft> getAircraftsInCourtyard() {
        return aircraftsInCourtyard;
    }

    public void setAircraftsInCourtyard(ArrayList<Aircraft> aircraftsInCourtyard) {
        this.aircraftsInCourtyard = aircraftsInCourtyard;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public boolean equals(Airport airport) {
        return airport != null && this.getCode() == airport.getCode();
    }

    public void addAircraftToCourtyard(Aircraft aircraft) {
        this.getAircraftsInCourtyard().add(aircraft);
    }

    public boolean isAircraftInCourtyard(String aircraftPrefix) {
        for (Aircraft aircraft: aircraftsInCourtyard) {
            if (aircraftPrefix.equals(aircraft.getPrefix())) return true;
        }
        return false;
    }

//    public static String getAirportNameFromCode(Airport airport) {
//        airport.getCode()
//    }

    public boolean hasRoute (Airport airport) {
        if (this.getDepartureAirports().contains(airport) || this.getDestinationAirports().contains(airport)) return true;
        else {
            for (Airport airportAux: this.getDepartureAirports()) {
                return airportAux.hasRoute(airport);
            }

            for (Airport airportAux: this.getDestinationAirports()) {
                return airportAux.hasRoute(airport);
            }
        }

        return false;
    }

    public ArrayList<Integer> getFlights(City departureCity, City destinationCity, String date) {
        ArrayList<Integer> flightNumbers = new ArrayList<>();

        for (Flight flight: flights) {
            if ((flight.getDepartureDate().equals(date) || flight.getArrivalDate().equals(date)) && (flight.getDepartureAirport().getCity().equals(departureCity) || flight.getDestinationAirport().equals(destinationCity)))
                flightNumbers.add(flight.getNumber());
        }

        return flightNumbers;
    }

    public void addFlight (Flight flight) {
        this.flights.add(flight);
        this.destinationAirports.add(flight.getDestinationAirport());
    }
}
