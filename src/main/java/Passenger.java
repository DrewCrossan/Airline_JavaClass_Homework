public class Passenger {

    private String name;
    private int numOfBags;
    private String flight;

    public Passenger(String name, int numOfBags, String flight){
        this.name = name;
        this.numOfBags = numOfBags;
        this.flight = flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getFlight() {
        return flight;
    }
}
