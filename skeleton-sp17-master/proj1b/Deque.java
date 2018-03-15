/** Creating a interface.*/
public interface Deque<Item> {
    /**
     * Remove the first item from the ArrayDeque.
     * */
    Item removeFirst();

    /**
     * Remove the last item from the ArrayDeque.
     **/
    Item removeLast();
    
    /** Add item to the ArrayDeque at first index.*/
    void addFirst(Item item);
    
    /** Add item to the ArrayDeque at the last index. */
    void addLast(Item item);
    
    /** Return the size of the ArrayDeque.*/
    int size();
    
    /** Check the ArrayDeque is empty or not.*/
    boolean isEmpty();
    
    /** Get the item at the specified index.*/
    Item get(int index);
    
    }
    
    
    
    
    


 
