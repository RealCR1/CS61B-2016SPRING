public class DLList<Item> {
	public class Node {
		public int item;
		public Node pre;
		public Node next;

		public Node(int i, Node p, Node n) {
			this.item = i;
			this.pre = p;
			this.next = n;
		}
	}	

	public int size;
	public Node sentinal;
	public Node last;

	//Create an empty double linked list.
	public DLList() {
		sentinal = new Node(null, null, null);
		this.sentinal.pre = sentinal;
		this.sentinal.next = sentinal;
	}

	//Add an item to the beginning of the DLList.
	public void addFirst(Item i) {
		this.sentinal.next = new Node(i, this.sentinal, this.sentinal.next);
		this.sentinal.next.pre = new Node(i, this.sentinal, this.sentinal.next);
		size += 1;
	}

	public void addLast(Item i) {
		size += 1;
		IntNode Node = new Node(i, this.sentinal, this.sentinal.pre);
		this.sentinal.pre = Node;
		this.sentinal.pre.next = Node;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public Item removeFirst() {
		if (this.sentinal.next == null) {
			return null; //If the sentinal's next pointer is null, the DLList is empty.	
		}

		Item item = this.sentinal.next.item;
		sentinal.next = sentinal.next.next;

		size -= 1;
		return item;
	}

	public Item removeLast() {
		Item item = last.item;
		last = last.pre;
		last.next = sentinal;

		size -= 1;
		return item;
	}

	public void printDeque() {
		Node p = this.sentinal.next;
		while (p != sentinal.pre) {
			System.out.println(p.item + " ");
			p = p.next;
		}
	}


	public Item get(int index) {
		if (this.size() == 0) {
			return null;
		} else {
			Node p = this.sentinal.next;
			while (index != 0) {
				if (p.next == this.sentinal) {
					return null;
				}
				p = p.next;
				index -= 1;
			}
			return p.item;
		}
	}


	//Using the recursion
	public Item getRecursive(int index) {
		if (index == 0) {
			return this.sentinal.next.item;
		}
		Node p = this.sentinal.next;
		return getRecursiveHelper(p, index);
	}

	public Item getRecursiveHelper(Node p, int index) {
		if (index == 0) {
			return p.item;
		} else {
			p = p.next;
			return getRecursiveHelper(p, index-1);
		}
	}
	
}


