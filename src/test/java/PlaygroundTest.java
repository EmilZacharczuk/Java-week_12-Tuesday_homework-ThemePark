
import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("Johny Walker",3);

    }
    @Test
    public void hasName() {
        assertEquals("Johny Walker", playground.getName());
    }
    @Test
    public void canImplementAgeRestrictioIfFalse() {
        visitor = new Visitor(16, 170, 45.00);
        assertEquals(false, playground.isAllowedTo(visitor));
    }
    @Test
    public void canImplementAgeRestrictioIfTrue() {
        visitor = new Visitor(14, 170, 45.00);
        assertEquals(true, playground.isAllowedTo(visitor));
    }
    @Test
    public void hasRating() {
        assertEquals(3, playground.getRating());
    }
}