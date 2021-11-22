import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

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
        passenger1 = new Passenger("David", 2);
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUS350);
        flight1 = new Flight(pilot1, plane1, "1", "GLA", "EDI", "15:00");
        flight2 = new Flight(pilot2, plane2, "2", "LDN", "EDI", "16:00");


    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(500, flight1.getRemainingSeats());
        assertEquals(300, flight2.getRemainingSeats());
    }

    @Test
    public void addPassengerToPlane(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addCrewMember(crewMember1);
        assertEquals(496, flight1.getRemainingSeats());
        assertEquals(3, flight1.numberOfPassengers());
    }

    @Test
    public void addCrewToPlane(){
        flight2.addCrewMember(crewMember1);
        flight2.addCrewMember(crewMember1);
        flight2.addCrewMember(crewMember1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        assertEquals(294, flight2.getRemainingSeats());
        assertEquals(3, flight2.numberOfCabinCrew());
    }
}
