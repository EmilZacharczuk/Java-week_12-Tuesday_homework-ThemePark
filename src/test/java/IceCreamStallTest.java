import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Stall","Johny Bee", 4,3);
    }

    @Test
    public void hasName() {
        assertEquals("Stall", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerNaem() {
        assertEquals("Johny Bee", iceCreamStall.getOwnerName());
    }
    @Test
    public void hasParkingSlot() {
        assertEquals(4, iceCreamStall.getParkingSpot());
    }
    @Test
    public void hasRating() {
        assertEquals(3, iceCreamStall.getRating());
    }
}
