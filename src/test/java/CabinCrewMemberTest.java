import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember crewMember1;

    @Before
    public void setUp(){
        crewMember1 = new CabinCrewMember("Attendant1", RankType.FLIGHT_ATTENDANT);
    }

    @Test
    public void relayToPassengers(){
        assertEquals("Please fasten your seatbelts!", crewMember1.passengerInstructions());
    }
}
