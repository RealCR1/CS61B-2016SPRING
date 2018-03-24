import org.junit.Test;
import static org.junit.Assert.*;

public class TestSans {
	@Test
	public void testSans() {
		// TEST THE ARRAY VERSION OF SANS.
		int[] x = {1, 2, 3, 4, 5};
		int y = 3;

		int[] expected = {1, 2, 4, 5};
		int[] actual = sans(x, y);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testIlsans() {
		//TEST THE NON-DESTRUCTIVE VERSION OF SANS.
		IntList x = IntList.of(1, 2, 3, 4, 5);
		int y = 1;
		IntList expected = IntList.of(2, 3, 4, 5);
		IntList actual = Sans.ilsans(x, y);
		assertEquals(expected, actual);
		assertEquals(x, actual);

	}
}