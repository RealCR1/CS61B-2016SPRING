package synthesizer;
import java.util.Iterator;


public interface BoundedQueue {
    int capcitity(); //Return size of the buffer.
    int fillCount(); //return number of items currently in the buffer.
    void enqueue(int x); // add item x to the end.
    int dequeue(); // delete and return item from the front.
    int peek(); // Return (but don't delete) item from the front.
    
    // is the buffer empty?
    default boolean isEmpty() {
        return (this.fillCount() == 0);
    }
    
    // is the buffer full?
    default boolean isFull() {
        return (this.fillCount() == this.capcitity());
    }
}
