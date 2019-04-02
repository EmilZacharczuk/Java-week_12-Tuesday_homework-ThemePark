
import Stalls.TabaccoStall;
import Visitors.Visitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TabaccoStallTest {

    TabaccoStall tabaccoStall;
    Visitor visitor;

    @Before
    public void before() {
        tabaccoStall = new TabaccoStall("Stall","Johny Bee", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Stall", tabaccoStall.getName());
    }

    @Test
    public void hasOwnerNaem() {
        assertEquals("Johny Bee", tabaccoStall.getOwnerName());
    }
    @Test
    public void hasParkingSlot() {
        assertEquals(4, tabaccoStall.getParkingSpot());
    }
    @Test
    public void canImplementAgeRestrictioIfFalse() {
        visitor = new Visitor(16, 170, 45.00);
        Assert.assertEquals(false, tabaccoStall.isAllowedTo(visitor));
    }
    @Test
    public void canImplementAgeRestrictioIfTrue() {
        visitor = new Visitor(18, 170, 45.00);
        Assert.assertEquals(true, tabaccoStall.isAllowedTo(visitor));
    }
}
