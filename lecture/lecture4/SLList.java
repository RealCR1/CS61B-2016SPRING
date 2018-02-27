/* An SLList is a list of integers
 * Hides the terrible truth of nakeness.
 */
public class SLList {
	

/** A nested class. 
*A nested class has no meaningful usage for code performance.
*Just for well-organized in code.
*/

	//Using 'static' is good for saving memory. 
	// It won't get access to outer class's instance.
	// Using 'private' is to make no access from outer class.
	private static class IntNode {
	
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
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


	public void addLast(int x){
		IntNode p = first;

		while(p.next != null){
			p = p.next;
		}
		p.next = new IntNode(x, null);
	}

	/** Returns the size of the list theat starts at IntNode p.
	And this is a helper method.
	*/
	private static int size(IntNode p){
		if(p.next == null){
			return 1;
		}
		return 1 + size(p.next);
	}

	public int size(){
		/*int i = 1;
		IntNode q = first;
		if(p == null){
			return 0;
		}
		while(p.next != null){
			i += 1;
		}
		return 1 + i;*/
		return size(first);
	}




	public static void main(String[] args){
		SLList L = new SLList(15); //There is no need to specify null.
		L.addFirst(10);
		L.addFirst(5);
		L.size();
		System.out.println(L.getFirst());
	}	
}
