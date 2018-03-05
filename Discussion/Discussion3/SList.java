
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


		//Using the recursive way to accomplish 'reverse' method.
		public void reverse(){
			first = reverseHelper(first);
		}


		//A helper method of reverse().
		public IntNode reverseHelper(IntNode front){
			if(front == null || front.next == null){
				retrun front;
			}
			else{
				//Reverse the node except the front node itself.
				IntNode remainNode = reverseHelper(front.next);
				
				//In the process of reverse, the front.next is the last one to reverse.
				//So in the reverse frame, the next item of front.next(front.next.next) is the front. 
				front.next.next = front;
				
				//Now the front is the last item, so the next pointer should be null.
				front.next = null;
				
				return remainNode;
			}
		}




}