public class Flight {
    private int number;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private int availableSeatsQuantity;
    private Airport departureAirport;
    private Airport destinationAirport;
    private Aircraft aircraft;

    public Flight(int number, String departureDate, String departureTime, String arrivalDate, String arrivalTime, int availableSeatsQuantity, Airport departureAirport, Airport destinationAirport, Aircraft aircraft) {
        this.number = number;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.availableSeatsQuantity = availableSeatsQuantity;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.aircraft = aircraft;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAvailableSeatsQuantity() {
        return availableSeatsQuantity;
    }

    public void setAvailableSeatsQuantity(int availableSeatsQuantity) {
        this.availableSeatsQuantity = availableSeatsQuantity;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getFlightInformations() {
        return String.format("Flight number: " + this.getNumber() +
                "\nAvailable seats quantity: " + this.getAvailableSeatsQuantity() +
                "\nDeparture date: "+ this.getDepartureDate() +
                "\nDeparture time: "+ this.getDepartureTime() +
                "\nArrival date: "+ this.getArrivalDate() +
                "\nArrival time: " + this.getArrivalTime() +
                "\nAirport of origin: " + this.getDepartureAirport() +
                "\nAirport of destination: " + this.getDestinationAirport() +
                "\nAircraft: " + this.getAircraft()
        );
    }
}
