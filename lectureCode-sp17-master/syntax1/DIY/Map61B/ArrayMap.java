package Map61B;

import org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * An array based implementation of the Map61B class.
 */
public class ArrayMap<K, V> implements Map61B<K, V> {
    private K[] keys;
    private V[] values;
    int size;
    
    public ArrayMap() {
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    /** Returns the index of the given key if it exists,
     *  -1 otherwise. */
    private int keyIndex(K key) {
        // 'i < size' is a better solution because we don't need to check each key.
        for (int i = 0; i < size; i += 1) {
            // Use equals() method to check the key value is same or not.
            // '==' which is useful for pointing to the same thing.
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }


    public boolean containsKey(K key) {
        return (keyIndex(key) > -1);
/*
        int index = keyIndex(key);
        if (index == -1) {
            return false;
        }
        return true;
*/
    }

    public void put(K key, V value) {
        int index = keyIndex(key);
        if (index == -1) {
            // Don't have a key like input.
            keys[size] = key;
            values[size] = value;
            size += 1;
            return;
        }
        //Find this key, and change the value which this key associated with.
        values[index] = value;
    }

    public V get(K key) {
        int index = keyIndex(key);
        return values[index];
    }

    public int size() {
        return size;
    }

    public List<K> keys() {
        List<K> newList = new ArrayList<K>();
        for (int i = 0; i < keys.length; i += 1) {
            newList.add(keys[i]);
        }
        return newList;
    }

    @Test
    public void test() {
        ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
        am.put(2, 5); // Integer type
        int expected = 5; // int type
        assertEquals((Integer) expected, am.get(2));
    }

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
    }
}
