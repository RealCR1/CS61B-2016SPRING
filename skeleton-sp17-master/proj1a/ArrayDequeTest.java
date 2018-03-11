/* @author Jonathan Wang
* */
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDequeTest {

    @Test
    public void testAddRemove() {
        /* Write test of String.
        **/
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


        /* Write test of integer.
        */
        int[] expected = {1, 2, 3, 4, 5};

        ArrayDeque<Integer> intArr = new ArrayDeque<>();

        intArr.addLast(4);
        intArr.addLast(5);
        intArr.addFirst(3);
        intArr.addFirst(2);
        intArr.addFirst(0);
        intArr.addLast(6);

        intArr.removeFirst();
        intArr.removeLast();

        for(int j = 0; j < expected.length; j++) {
            assertEquals(expected[j], intArr.get(i).intValue());
        }


    }
}
