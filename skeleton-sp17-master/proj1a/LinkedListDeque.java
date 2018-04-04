public class LinkedListDeque<Item> {

    //Using the normal way, instantiate nested class Node.
    private class Node {
        private Item item;
        //Make a circular LinkedList.
        private Node pre, next;

        //Class constructor.
        public Node(Item i, Node p, Node n) {
            this.item = i;
            this.pre = p;
            this.next = n;
        }
    }

    private Node sentinal;
    private Node last;
    private int size = 0;


    //Create an empty linked list.
    public LinkedListDeque() {
        this.sentinal = new Node(null, null, null );
        this.sentinal.next = this.sentinal;
        this.sentinal.pre = this.sentinal;
    }


    //Adds an item to the front of the Deque.
    public void addFirst(Item item){
        this.sentinal.next = new Node(item, this.sentinal.next, this.sentinal.next);
        this.sentinal.next.pre = new Node(item, this.sentinal.next, this.sentinal.next);
        size += 1;
    }


    //Adds an item to the back of the Deque.
    public void addLast(Item item){
        this.sentinal.pre.next = new Node(item, this.sentinal, this.sentinal.pre);
        this.sentinal.pre = new Node(item, this.sentinal, this.sentinal.pre);
        size += 1;

    }


    //Returns the number of items in the Deque.
    public int size(){
        return size;
    }



    //Returns True if Deque is empty, false otherwise.
    public boolean isEmpty(){
        return size == 0;
    }


    //Prints the items in the Deque form first to last.
    //Separated by a space.
    public void printDeque(){
        Node p = this.sentinal.next;
        while(true){
            System.out.println(p.item + " ");
            if(p == sentinal.pre){
                break;
            }
            p = p.next;

        }
    }




    //Removes and returns the item at the front of the Deque.
    //If no such item exists, returns null.
    public Item removeFirst(){
        if(sentinal.next == null){
            return null;
        }

        Item item = sentinal.next.item;
        sentinal.next = sentinal.next.next;
        size -= 1;
        return item;
    }


    //Removes and returns the item at the back of the Deque.
    //If no such item exists, returns null.
    public Item removeLast(){
        Item item = (Item)last.item;
        last = last.pre;
        last.next = sentinal;
        return item;
        
    }


    //Gets the item at the given index, where 0 is the front.
    //1 is the next item, and so forth.
    //If no such item exists, returns null.
    //Must not alter the Deque.
    public Item get(int index){
        if(sentinal.next == null){
            return null;
        }
        else{
            Node p = this.sentinal.next;
            while(index != 0){
                if(p.next == this.sentinal){
                    return null;
                }

                p = p.next;
                index -= 1;
            }
            return p.item;
        }

    }


    //Same as get, but uses recursion.
    //Also non-destructive method.
    public Item getRecursive(int index){
        if(index == 0){
            return this.sentinal.next.item;
        }
        Node p = this.sentinal.next;
        return helper(index, p);
    }


    private Item helper(int index, Node p){
        if(index == 0){
            return p.item;
        }
        else{
            p = p.next;
            return helper(index - 1, p);
        }
    }

}
