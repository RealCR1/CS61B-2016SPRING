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
    public static boolean isPalindrome() {
        
        
    }
}
