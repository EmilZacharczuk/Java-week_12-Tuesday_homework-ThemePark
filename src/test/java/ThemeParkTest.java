import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import themePark.ThemePark;


import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Playground playground;


    @Before
    public void before() {
        themePark = new ThemePark();

    }

    @Test
    public void getArrayList() {
        playground = new Playground("Funny Place", 5);
        themePark.addSite(playground);
        assertEquals(1, themePark.getAllReviewed());
    }
}
