import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp() throws Exception { visitor = new Visitor("Joe", 31, 185, 50); }
    @Test
    public void hasName() { assertEquals("Joe", visitor.getName()); }
    @Test
    public void hasAge() { assertEquals(31, visitor.getAge()); }
    @Test
    public void hasHeight() { assertEquals(185, visitor.getHeight()); }
    @Test
    public void hasFunds() { assertEquals(50, visitor.getFunds()); }

}
