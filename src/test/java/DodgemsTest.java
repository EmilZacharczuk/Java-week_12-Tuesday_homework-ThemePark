import Attractions.Dodgems;
import interfaces.IReviewed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Johny Walker",2);
    }

    @Test
    public void hasName() {
        assertEquals("Johny Walker", dodgems.getName());
    }
    @Test
    public void hasRating() {
        assertEquals(2, dodgems.getRating());
    }
}
