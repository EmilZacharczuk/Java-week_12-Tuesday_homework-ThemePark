import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Stall","Johny Bee", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Stall", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerNaem() {
        assertEquals("Johny Bee", candyFlossStall.getOwnerName());
    }
    @Test
    public void hasParkingSlot() {
        assertEquals(4, candyFlossStall.getParkingSpot());
    }
}
