
public class SList {
	
	//For performance efficient.
	private class IntNode{

		public IntNode next;
		public int i;

		public IntNode(int i, IntNode n){
			this.item = i;
			this.next = n;
		}
	}

	public IntNode first;

	public void addFirst(int x){
		first = new IntNode(x, first);
	}

	public void insert(int i, int position){
		if(first == null || position = 0){
			addFirst(i);
			return 0;
		}

		IntNode node = first;

		while(position > 1 && node.next != null){
			position = position - 1;
			node = node.next;
		}

		IntNode newNode = new Node(item, node.next);
		node.next = newNode;

	}


	public void reverse(){
		IntNode currentNode = null;
		IntNode nextToAddNode = first;

		while(nextToAddNode != null){
			IntNode remainderOfOriginalNode = nextToAddNode.next;
			nextToAddNode.next = currentNode;
			currentNode = nextToAddNode;
			nextToAddNode = remainderOfOriginalNode;

		}

		first = currentNode;
	}


	
}