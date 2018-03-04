
public class LinkedLIstDeque<item>{
	
	private class Node{
		private item i;
		private Node pre, next;

		public Node(item i, Node p, Node n){
			this.item = i;
			this.pre = p;
			this.next = n;
		}
	}

	private Node sentinal;
	private Node last;
	private int size = 0;


	public LinkedLIstDeque(){
		this.sentinal = new Node(null, null, null);
		this.sentinal.next = this.sentinal;
		this.sentinal.pre = this.sentinal;
	}


	public void addFirst(Item item){
		this.sentinal.next = new Node(item, this.sentinal.next, this.sentinal.next);
		this.sentinal.next.pre = new Node(item, this.sentinal.next, this.sentinal.next);
		size += 1;
	}


	public void addLast(Item item){
		this.sentinal.pre.next = new Node(item, this.sentinal, this.sentinal.pre);
		this.sentinal.pre = new Node(item, this.sentinal, this.sentinal.pre);
		size += 1;
	}


	public static void main(String[] args){
		
	}	
}