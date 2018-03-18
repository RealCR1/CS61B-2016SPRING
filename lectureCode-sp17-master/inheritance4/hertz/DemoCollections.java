import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class DemoCollections {

	/** Returns a lower case version of the string with
	  * all characters except letters removed. */
    public static String cleanString(String s) {
        return s.toLowerCase().replaceAll("[^a-z]", "null");
	    /** [^a-z] to check if any characters except a-z.
         *  Same to check the A-Z expect a-z in file.
         *  So the method is to change all characters which isn't a-z into null.
         *  
         *  '.*[^a-z].*' won't fail on more than one character.
         *  */
        
	}

	/** Gets a list of all words in the file. */
    public static List<String> getWords(String inputfilename) {
        List<String> words = new ArrayList<String>();
        In in = new In(inputfilename);
        while (!in.isEmpty()) {
            String nextWord = cleanString(in.readString());
            words.add(nextWord);
        }
        return words;
    }

	/** Returns the count of the number of unique words in words. */
	public static int countUniqueWords(List<String> words) {
		Set<String> strWords = new HashSet<String>();
		for (String ithWord : strWords) {
		    strWords.add(ithWord);
        }
        return strWords.size();
	}

	/** Returns a map (a.k.a. dictionary) that tracks the count of all specified
	  * target words in words. */
	public static Map<String, Integer> collectWordCount(List<String> words, List<String> targets) {
		Map<String, Integer> counts = new HashMap<String, Integer>();
		for (String t : targets) {
		    counts.put(t, 0);
        }
        
        for (String s : words) {
		    int oldCount = counts.get(s);
		    counts.put(s, oldCount + 1);
        }
        return counts;
	}

	public static void main(String[] args) {
		List<String> w = getWords("libraryOfBabylon.txt");
		System.out.println(countUniqueWords(w));
		
		List<String> targets = new ArrayList<String>();
		targets.add("lottery");
		targets.add("the");
		targets.add("babylon");

		System.out.println(collectWordCount(w, targets));
	}
} 