package Map61B;

import static org.junit.Assert.*;
import org.junit.Test;

import java.security.Key;
import java.util.List;

/**
 * Class to demonstrate how generic methods work in Java.
 */
public class MapHelper {
    /* Write the following three methods:
    /* get(Key) : Return item in map if it exists. */
    /* maxKey() : Returns max of all keys. Works only if x and y have comparable data. */
    /* allBark(): Makes all keys bark, but only works for Dogs. */
    public static <K, V> V get(Map61B<K,V> map, K key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
        
        
    }
    
    @Test
    public void testGet() {
        Map61B<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);

        Integer actual = MapHelper.get(m, "fish");
        Integer expected = 9;
        assertEquals(expected, actual);
    }
    
    public static <K extends Comparable<K>, V> K maxKey(Map61B<K, V> map) {
        List<K> keyList = map.keys();
        K largest = keyList.get(0);
        for (K k : keyList) {
            if (k.compareTo(largest) > 0) {
                largest = k;
            }
        }
        return largest;
    }

    @Test
    public void testMaxKey() {
        Map61B<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);

        String actual = MapHelper.maxKey(m);
        String expected = "house";
        assertEquals(expected, actual);
    }    
}
