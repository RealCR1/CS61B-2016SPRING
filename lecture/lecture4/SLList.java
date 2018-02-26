/* An SLList is a list of integers
 * Hides the terrible truth of nakeness.
 */
public class SLList {
	

/** A nested class. */

	public class IntNode {
	
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
	}


	public IntNode first;
	public SLList(int x){
		first = new IntNode(x, null);
	}


	/** Adds x to the front of the list. */
	public void addFirst(int x){
		 first = new IntNode(x, first);
	}

	/** Return the first element in the list. */
	public int getFirst(){
		return first.item;
	}
}

	public static void main(String[] args){
		SLList L = new SLList(10); //There is no need to specify null.
	}	

