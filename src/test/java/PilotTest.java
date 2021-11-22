import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;

    @Before
    public void setUp(){
        pilot1 = new Pilot("Drew", RankType.CAPTAIN, "DRWC90");
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Pilot is flying!", pilot1.flyPlane());
    }

}
