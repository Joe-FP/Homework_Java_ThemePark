import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp(){
        themePark = new ThemePark("Alton Towers");
        rollerCoaster = new RollerCoaster("Pepsi Max", 10, 16, 160);
        visitor1 = new Visitor("Joe", 31, 185, 50);
        visitor2 = new Visitor("Adrian", 15, 160, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Alton Towers", themePark.getName());
    }

    @Test
    public void canAddAttraction(){
        themePark.addAttraction(rollerCoaster);
        assertEquals(1, themePark.attractionCount());
    }

    @Test
    public void canVisit__true(){
        assertTrue(rollerCoaster.isAllowedToRide(visitor1));
        themePark.visit(rollerCoaster, visitor1);
        assertEquals(1, rollerCoaster.visitorCount());

    }

    @Test
    public void canVisit__false() {
        assertFalse(rollerCoaster.isAllowedToRide(visitor2));
        themePark.visit(rollerCoaster, visitor2);
        assertEquals(0, rollerCoaster.visitorCount());
    }
}
