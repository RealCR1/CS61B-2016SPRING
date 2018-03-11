/* @author Jonathan Wang
* */
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDequeTest {

    @Test
    public void testAddRemove() {
        /* Write test of String.
        **/
        String[] expectedStirng = {"a", "b", "c", "d"};

        ArrayDeque<String> stringArr = new ArrayDeque<>();

        stringArr.addLast("c");
        stringArr.addFirst("b");
        stringArr.addFirst("a");
        stringArr.addFirst("zero");
        stringArr.removeFirst();
        stringArr.addLast("d");

        for(int i = 0; i < expectedStirng.length; i++) {
            assertEquals(stringArr.get(i), expectedStirng[i]);
        }


        /* Write test of integer.
        */
        int[] expectedInt = {1, 2, 3, 4, 5};

        ArrayDeque<Integer> intArr = new ArrayDeque<>();

        intArr.addLast(4);
        intArr.addLast(5);
        intArr.addFirst(3);
        intArr.addFirst(2);
        intArr.addFirst(1);
        intArr.addFirst(0);
        intArr.addLast(6);

        intArr.removeFirst();
        intArr.removeLast();

        for(int j = 0; j < expectedInt.length; j++) {
            assertEquals(expectedInt[j], intArr.get(j).intValue());
        }
    }


    @Test
    public void testResize() {

    }
}
