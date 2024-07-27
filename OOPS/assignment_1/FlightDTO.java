package OOPS.assignment_1;

// 3. Create Flight DTO class. Create appropriate instance variables,
// static variables and methods with appropriate access modifiers.

public class FlightDTO {

    private String flightNumber;
    private String flightName;
    private String origin;
    private String destination;
    private int capacity;
    public static int totalFlights;

    public FlightDTO(String flightNumber, String flightName, String origin, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        totalFlights++;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        FlightDTO flight1 = new FlightDTO("123", "sample flight", "abc", "xyz", 100);
        FlightDTO flight2 = new FlightDTO("456", "dimple fliggt", "abc", "iais", 200);
    }
}
