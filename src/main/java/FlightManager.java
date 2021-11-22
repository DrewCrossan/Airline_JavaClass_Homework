public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int reservedBaggageWeight(){
        return flight.getPlane().getPlaneWeight() / 2;
    }

    public int passengerBaggageLimit(){
        return reservedBaggageWeight()/flight.getPlane().getPlaneCapacity();
    }

    public int totalRemainingPassengerWeight(){
        return reservedBaggageWeight() - (flight.numberOfPassengers() * passengerBaggageLimit());
    }
}
