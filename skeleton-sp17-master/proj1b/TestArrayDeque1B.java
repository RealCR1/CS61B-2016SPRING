/** @author Jonathan Wang
 *  3/14/2018
 *  Project 1B Phase I Task I.*/
import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDeque1B {
    @Test
    /** The name of this test doesn't matter.
     *  This test should randomly call StudentArrayDeque() method,
     *  and ArrayDequeSolution() method until they disagree on an output.
     *
     *  And using the StdRandom() to generate random number.
     *  */
    public void testCallTwoMethods(int testTime) {
        for (int i = 0; i < testTime; i++) {
            double numberBetweenOneAndZero = StdRandom.uniform();

            if (numberBetweenOneAndZero < 0.5) {
                testStudentArrayDeque();
            } else {
                testArrayDequeSolution();
            }

        }



    }
}
