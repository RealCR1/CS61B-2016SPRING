public class OffByOne implements CharacterComparator {
    /** equalChars() returns true for letters
     *  That are different by exactly one letter.
     *  */
    @Override
    public boolean equalChars(char x, char y) {
        return Math.abs(x - y) == 1;
    }
    
}
