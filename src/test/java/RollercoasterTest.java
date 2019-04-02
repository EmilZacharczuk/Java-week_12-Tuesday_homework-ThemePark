
import Attractions.Rollercoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

        Rollercoaster rollercoaster;
        Visitor visitor;

        @Before
        public void before() {
            rollercoaster = new Rollercoaster("Johny Walker",3);
        }
        @Test
        public void hasName() {
            assertEquals("Johny Walker", rollercoaster.getName());
        }

    @Test
    public void canImplementAgeRestrictioIfFalse() {
        visitor = new Visitor(16, 170, 45.00);
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }
    @Test
    public void canImplementAgeRestrictioIfTrue() {
        visitor = new Visitor(14, 140, 45.00);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }
    @Test
    public void hasRating() {
        assertEquals(3, rollercoaster.getRating());
    }
    }
