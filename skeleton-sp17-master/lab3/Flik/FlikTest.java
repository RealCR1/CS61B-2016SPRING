/*This is test for Flik.java
* @author Jonathan Wang.
* */
import static org.junit.Assert.*;

import org.junit.Test;

public class FlikTest {
    @Test
    public void testIsSameNumber() {
        assertEquals(true, Flik.isSameNumber(5, 5));
        assertEquals(true, Flik.isSameNumber(0, 0));
        assertEquals(false, Flik.isSameNumber(5, -5));
    }

}
