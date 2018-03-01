/* Your ArrayDeque class must include a zero argument constructor that creates an empty Deque.
*  your operations are subject to the following rules:
*  add and remove must take constant time, except during resizing operations.
*  get and size must take constant time.
*  The starting size of your array should be 8.
*  The amount of memory that your program uses at any given time must be proportional to the number of items.
*  For example, if you add 10,000 items to the Deque, and then remove 9,999 items, you shouldn't still be using an array of length 10,000ish.
*  For arrays of length 16 or more, your usage factor should always be at least 25%.
*  For smaller arrays, your usage factor can be arbitrarily low.
*/


public class ArrayDeque<Item> {
    private int size = 0;
    private int nextFirst = 0;
    private int nextLast = 1;
    private Item[] arr;


    //And how to declare the size of the ArrayDeque.
    //I don't know. Learning from other's code.
    private static final int MIN_INITIAL_CAPACITY = 8;


    //Try to create an ArrayDeque class constructor which has zero argument.
    //This will create an empty Deque.
    public ArrayDeque(){
        arr = (Item[]) new Object[MIN_INITIAL_CAPACITY];

    }

    //This method will add a item as the first element in ArrayDeque.
    //The front pointer should loop back around to the end of the array.
    //So a circular array is a good idea.
    



}
