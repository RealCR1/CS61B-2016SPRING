
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
		if(position == 0 || first == null){
			addFirst(i);
			return 0;
		}

		IntNode node = first;

		while(position > 1 && node.next != null){
			position -= 1;
			node = node.next;

		}

		IntNode newNode = new IntNode(i, node.next);

		node.next = newNode;

	}



	public void reverse(){
		IntNode currentAddingNode = null;
		IntNode removingNode = first;

		while(removingNode != null){
			//Keep tracking the left.
			IntNode originalLeftNode = removingNode.next;
			//Make removingNode to be null?
			removingNode.next = currentAddingNode;
			//Copy this item to currentAddingNode.
			currentAddingNode = removingNode;
			//Make the removingNode keep going to next.
			removingNode = originalLeftNode;

		}



}