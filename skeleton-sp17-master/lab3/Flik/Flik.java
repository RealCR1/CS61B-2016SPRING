/** An Integer tester created by Flik Enterprises. */
public class Flik {
    public static boolean isSameNumber(Integer a, Integer b) {
        /*The former code is
        * return a == b;
        * You know, the '==' compare the reference to the pointer.
        * And the equals() compares the true value.
        * When integer is instantiated in Java, it should has 32 bits.
        * When it comes to 128, pointers of a and b are different.
        * */
        return a.equals(b);
    }
}
