
// TODO: Make sure to make this class a part of the synthesizer package
package synthesizer;

import java.util.Iterator;

/**
 * @author Jonathan Wang
 * Email: wz892477341@outlook.com
 * Created on 3/26/2018
 */

//TODO: Make sure to make this class and all of its methods public
//TODO: Make sure to make this class extend AbstractBoundedQueue<t>
public class ArrayRingBuffer extends AbstractBoundedQueue {
    /* Index for the next dequeue or peek. */
    private int first;            // index for the next dequeue or peek
    /* Index for the next enqueue. */
    private int last;
    /* Array for storing the buffer data. */
    private int[] rb;

    /**
     * Create a new ArrayRingBuffer with the given capacity.
     */
    public ArrayRingBuffer(int capacity) {
        // TODO: Create new array with capacity elements.
        //       first, last, and fillCount should all be set to 0.
        //       this.capacity should be set appropriately. Note that the local variable
        //       here shadows the field we inherit from AbstractBoundedQueue, so
        //       you'll need to use this.capacity to set the capacity.
        first = 0;
        last = 0;
        this.fillCount = 0;
        this.capacity = capacity;
        
        rb = new int[this.capacity];
    }

    /**
     * Adds x to the end of the ring buffer. If there is no room, then
     * throw new RuntimeException("Ring buffer overflow"). Exceptions
     * covered Monday.
     */
    public void enqueue(int x) {
        // TODO: Enqueue the item. Don't forget to increase fillCount and update last.
        if(isFull()) {
            throw new RuntimeException("Ring buffer overflow");
        }
        rb[last] = x;
        if(last == rb.length - 1) {
            last = 0;
        } else {
            last += 1;
        }
        fillCount += 1;
    }

    /**
     * Dequeue oldest item in the ring buffer. If the buffer is empty, then
     * throw new RuntimeException("Ring buffer underflow"). Exceptions
     * covered Monday.
     */
    public int dequeue() {
        // TODO: Dequeue the first item. Don't forget to decrease fillCount and update 
        if(isEmpty()) {
            throw new RuntimeException("Ring buffer underflow");
        }
        int removedItem = rb[first];
        rb[first] = 0;
        if(first == rb.length - 1) {
            first = 0;
        } else {
            first += 1;
        }
        fillCount += 1;
        return removedItem;
    }

    /**
     * Return oldest item, but don't remove it.
     */
    public int peek() {
        // TODO: Return the first item. None of your instance variables should change.
        return rb[first];
    }

    // TODO: When you get to part 5, implement the needed code to support iteration.
}
