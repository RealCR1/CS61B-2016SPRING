public class LinkedListDeque{

    //Using the normal way, instantiate nested class IntNode.
    private class IntNode{
        private int item;
        //Make a circular LinkedList.
        private IntNode pre, next;

        //Class constructor.
        public IntNode(int i, IntNode p, IntNode n){
            item = i;
            pre = p;
            next = n;
        }
    }

    private IntNode sentinal;
    private IntNode last;
    private int size = 0;


    //Create an empty linked list.
    public LinkedListDeque(){
        this.sentinal = new IntNode(null, null, null );
        this.sentinal.next = this.sentinal;
        this.sentinal.pre = this.sentinal;
    }


    //Adds an item to the front of the Deque.
    public void addFirst(int x){
        this.sentinal.next = new IntNode(x, this.sentinal.next, this.sentinal.next);
        this.sentinal.next.pre = new IntNode(x, this.sentinal.next, this.sentinal.next);
        size += 1;

    }


    //Adds an item to the back of the Deque.
    public void addLast(int x){

    }


    //Returns the number of items in the Deque.
    public int size(){
        return size;
    }


    
    //Returns True if Deque is empty, false otherwise.
    public boolean isEmpty(){
        return size == 0;
    }

}
