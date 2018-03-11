/* @author Jonathan Wang
* */
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDequeTest {

    @Test
    public void testAddRemove() {
        String[] expected = {"a", "b", "c", "d"};

        ArrayDeque<String> stringArr = new ArrayDeque<>();

        stringArr.addLast("c");
        stringArr.addFirst("b");
        stringArr.addFirst("a");
        stringArr.addFirst("zero");
        stringArr.removeFirst();
        stringArr.addLast("d");

        for(int i = 0; i < expected.length; i++) {
            assertEquals(stringArr.get(i), expected[i]);
        }



    }
}
