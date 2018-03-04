/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */

    private int[] item;
    private int size;

    public AList() {
        item = new int[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        item[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return item[size - 1];
    }


    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return 0;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {

/*  There is no need to destroy that item.
    We can use the method that we have defined.

        int item_removed = item[size - 1];
        item[size - 1] = 0;
        size -= 1;
        return item_removed;
*/
        int x = getLast();
        size -= 1;
        return x

    }
} 