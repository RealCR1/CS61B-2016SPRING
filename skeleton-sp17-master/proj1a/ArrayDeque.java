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
    private static final int INITIAL_CAPACITY = 8;


    //Try to create an ArrayDeque class constructor which has zero argument.
    //This will create an empty Deque.
    public ArrayDeque(){
        arr = (Item[]) new Object[INITIAL_CAPACITY];

    }

    //This method will add a item as the first element in ArrayDeque.
    //The front pointer should loop back around to the end of the array.
    //So a circular array is a good idea.
    public void addFirst(Item item){
        if(item == null){
            throw new NullPointerException();
        }
        arr[nextFirst] = item;
        if(this.nextFirst == 0){
            nextFirst = this.arr.length - 1;
        }
        else{
            this.nextFirst -= 1;
        }

        size += 1;
        if(size == arr.length){
            this.resize(arr.length * 2);
        }
    }


    //Adds an item to the back of the Deque.
    public void addLast(Item item){
        if(item == null){
            throw new NullPointerException();
        }
        arr[nextLast] = item;
        nextLast = (nextLast + 1) % (this.arr.length - 1);
        size += 1;
        if(size == arr.length){
            this.resize(arr.length * 2);
        }

    }


    //Implementation of a helper method resize().
    public void resize(int full_number){
        int n = arr.length;
        Item[] new_arr = (Item[]) new Object[full_number];
        int pointer = 0;
        while(arr[pointer] == null){
            pointer += 1;
        }
        System.arraycopy(this.arr, pointer, new_arr, 0, size);
        arr = new_arr;
        nextFirst = full_number - 1;
        nextLast = n;
    }

    //Return the size of this ArrayDeque.
    public int size(){
        return size;
    }


    //Return True if ArrayDeque isn't empty.
    public boolean isEmpty(){
        return size == 0;
    }


    //Prints the items in the Deque.


    //Removes and returns the first item of the Deque.
    public Item removeFirst(){
        if(size = 0){
            return null;
        }
        Item item;
        if(nextFirst == arr.length - 1){
            item = (Item)arr[0];
            arr[0] = null;
            nextFirst = 0;
        }
        else{
            item = (Item) arr[nextFirst + 1];
            arr[nextFirst + 1] = null;
            nextFirst += 1;
        }
        size -= 1;
        return item;
    }


    //Removes and returns the item at the back of the Deque.
    public Item removeLast(){
        if(size == 0){
            return null;
        }
        Item item;
        if(nextLast == 0){
            item = (Item) arr[arr.length - 1];
            arr[arr.length - 1] = null;
            nextLast = arr.length - 1;
        }
        else{
            item = (Item) arr[nextLast - 1];
            arr[nextLast - 1] = null;
            nextLast -= 1;
        }
        size -= 1;
        return item;
    }








}
