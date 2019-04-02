import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(15, 167, 50.00);
    }

    @Test
    public void hasAge() {
        assertEquals(15, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(167, visitor.getHeight());
    }
    @Test

    public void hasMoney() {
        assertEquals(50.00, visitor.getMoney());
    }
}
