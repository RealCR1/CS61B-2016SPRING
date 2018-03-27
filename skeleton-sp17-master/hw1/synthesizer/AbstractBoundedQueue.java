package synthesizer;

/**
 * @author Jonathan Wang
 * Email: wz892477341@outlook.com
 * Created on 3/23/2018
 */

public abstract class AbstractBoundedQueue implements BoundedQueue{
    // Abstract classes can provide implementation inheritance for features other than public methods.
    protected int fillCount;
    protected int capacity;
    
    public int capacity() {
        return capacity;
    }
    
    public int fillCount() {
        return fillCount;
    }
    
    public boolean isEmpty() {
        return fillCount() == 0;
    }
    
    public boolean isFull() {
        return fillCount() == capacity();
    }
    
    public abstract double peek();
    
    public abstract double dequeue();
    
    public abstract void enqueue(double x);
}
