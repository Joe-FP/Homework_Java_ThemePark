import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        rollerCoaster = new RollerCoaster("Pepsi Max", 10, 16, 160);
        visitor = new Visitor("Joe", 31, 185, 50);
    }

    @Test
    public void noVisitorsToStart(){
        assertEquals(0, rollerCoaster.visitorCount());
    }

    @Test
    public void canAddVisitor(){
        rollerCoaster.addVisitor(visitor);
        assertEquals(1, rollerCoaster.visitorCount());
    }

    @Test
    public void hasName() {
        assertEquals("Pepsi Max", rollerCoaster.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(10, rollerCoaster.getPrice());
    }

    @Test
    public void hasMinAge() {
        assertEquals(16, rollerCoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(160, rollerCoaster.getMinHeight());
    }

}
