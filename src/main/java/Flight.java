import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> flightCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String airport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNum, String destination, String airport, String departureTime){
        this.pilot = pilot;
        this.flightCrew = new ArrayList<>(4);
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.airport = airport;
        this.departureTime = departureTime;

    }

    public int getRemainingSeats(){
        return plane.getPlaneCapacity() - passengers.size() - flightCrew.size();
    }

    public void addPassenger(Passenger passenger){
        if((passengers.size() + flightCrew.size()) < plane.getPlaneCapacity()) {
            passenger.setFlight(flightNum);
            this.passengers.add(passenger);
        }
    }

    public void addCrewMember(CabinCrewMember crewMember){
        if((passengers.size() + flightCrew.size()) < plane.getPlaneCapacity()){
            this.flightCrew.add(crewMember);
        }

    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public int numberOfPassengers(){

        return passengers.size();
    }

    public int numberOfCabinCrew(){

        return flightCrew.size();
    }


}
