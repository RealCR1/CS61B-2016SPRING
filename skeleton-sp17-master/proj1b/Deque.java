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
    
    /**
     * Print each item of the ArrayDeque.
     */
    void printDeque();
    
    void addFirst(Item item);
    
    void addLast(Item item);
    
    int size();
    
    boolean isEmpty();
    
    Item get(int index);
    
    
    }
    
    
    
    
    


 
