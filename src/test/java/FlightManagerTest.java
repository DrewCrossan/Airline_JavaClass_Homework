import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager1, flightManager2;
    Flight flight1, flight2;
    Pilot pilot1, pilot2, firstOfficer;
    Plane plane1, plane2;
    Passenger passenger1;
    CabinCrewMember crewMember1;

    @Before
    public void setUp(){
        pilot1 = new Pilot("Drew", RankType.CAPTAIN, "DRWC90");
        pilot2 = new Pilot("Gemma", RankType.CAPTAIN, "GMCC92");
        firstOfficer = new Pilot("Harley", RankType.FIRST_OFFICER, "HRLY19");
        crewMember1 = new CabinCrewMember("Lily", RankType.PURSER);
        passenger1 = new Passenger("David", 2, flight2.getFlightNum());
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUS350);
        flight1 = new Flight(pilot1, plane1, "1", "GLA", "EDI", "15:00");
        flight2 = new Flight(pilot2, plane2, "2", "LDN", "EDI", "16:00");
        flightManager1 = new FlightManager(flight1);
        flightManager2 = new FlightManager(flight2);
    }

    @Test
    public void getPassengerReservedWeight(){
        assertEquals(165000, flightManager1.reservedBaggageWeight());
        assertEquals(125000, flightManager2.reservedBaggageWeight());
    }

    @Test
    public void getPassengerBaggageWeight(){
        assertEquals(330, flightManager1.passengerBaggageLimit());
        assertEquals(416, flightManager2.passengerBaggageLimit());
    }

    @Test
    public void getRemainingTotalBaggageWeight(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        assertEquals(164010, flightManager1.totalRemainingPassengerWeight());
        assertEquals(123752, flightManager2.totalRemainingPassengerWeight());

    }
}
