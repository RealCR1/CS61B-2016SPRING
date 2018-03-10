/*This is test for Flik.java
* @author Jonathan Wang.
* */
import static org.junit.Assert.*;

import org.junit.Test;

public class FlikTest {
    @Test
    public void testIsSameNumber() {
        assertTrue(Flik.isSameNumber(5, 5));
        assertFalse(Flik.isSameNumber(5, -5));
        assertTrue(Flik.isSameNumber(0, 0));
    }

}
