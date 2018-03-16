public class Palindrome {
    /** The wordToDeque method should be straightforward.
     *  Build a Deque where the characters in the deque 
     *  appear in the same order as in the word.
     *  */
    public static Deque<Character> wordToDeque(String word) {
        Deque<Character> wordToDeque = new ArrayDeque<>();
        for (int i = 0; i <= word.length(); i++) {
           char character = word.charAt(i);
           wordToDeque.addLast(character);
        }
       return wordToDeque; 
    }
    
    /** The isPalindrome method should return true,
     *  if the given word is a palindrome and false otherwise.
     *  A Palindrome is defined as a word that is the same whether it is read forwards or backwards.
     *  */
    public static boolean isPalindrome(String word) {
        /** Before using this method to check
         *  We should change input into Deque.
         *  */
        Deque<Character> wordToDeque = wordToDeque(word);
        return isPalindrome(wordToDeque);
    }
    
    /** Define a method using the input format as Deque.*/
    public static boolean isPalindrome(Deque<Character> deque) {
        if (deque.size() == 0 || deque.size() == 1) {
            return true;
        }
        
        char firstItem = deque.removeFirst();
        char lastItem = deque.removeLast();
        
        if (firstItem == lastItem) {
            return true;
        }
        
        return isPalindrome(deque);
    }
    
    /** Using the interface in CharacterComparator and OffByOne.*/
    public static boolean isPalindrome(String word, CharacterComparator cc) {
        Deque<Character> charFromWord = wordToDeque(word);
        return isPalindrome(charFromWord, cc); 
    }
    
    /** Helper method for isPalindrome(String word, CharacterComparator cc).*/
    public static boolean isPalindrome(Deque<Character> deque, CharacterComparator cc) {
        if (deque.size() == 0 || deque.size() == 1) {
            return true;
        }

        char firstItem = deque.removeFirst();
        char lastItem = deque.removeLast();
        
        return equalChars(firstItem, lastItem) && isPalindrome(deque, cc);
    }
}
