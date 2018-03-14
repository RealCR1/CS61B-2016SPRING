/**
 * @author Jonathan Wang
 * 3/14/2018
 * Project 1B Phase I Task I.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayDeque1B {
    /** The name of this test doesn't matter.
     *  This test should randomly call StudentArrayDeque() method,
     *  and ArrayDequeSolution() method until they disagree on an output.
     *
     *  And using the StdRandom() to generate random number.
     *  */
    @Test
    public void testCallTwoMethods() {
        StudentArrayDeque<Integer> sad = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> ads = new ArrayDequeSolution<>();


        /** For checking at least four methods,
         *  We need instantiate a integer variable valuing from 0 to 3.
         */
        for (int i = 0; i < 50; i++) {
            int checkNumber = StdRandom.uniform(4);

            switch (checkNumber) {
                case 0:
                    sad.addFirst(i);
                    ads.addFirst(i);
                    break;
                case 1:
                    sad.addLast(i);
                    ads.addLast(i);
                case 2:
                    if (!sad.isEmpty() && ads.size() > 0) {
                        sad.removeFirst();
                        ads.removeFirst();
                    }
                    break;
                case 3:
                    if (!sad.isEmpty() && ads.size() > 0) {
                        sad.removeLast();
                        ads.removeLast();
                    }
                    break;
                default:
                    break;
            }
        }

        for(int j = 0; j < ads.size(); j++) {
            assertEquals(sad.get(j), ads.get(j));
        }

        assertEquals(ads.size(), sad.size());
    }
}
