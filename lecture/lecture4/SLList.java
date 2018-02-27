/* An SLList is a list of integers
 * Hides the terrible truth of nakeness.
 */
public class SLList {
	

/** A nested class. 
*A nested class has no meaningful usage for code performance.
*Just for well-organized in code.
*/

	//Using 'static' is good for saving memory. 
	// It won't get access to outer class's instances.

	// Using 'private' is to make no access from outer class.

	private static class IntNode {
		//Just like IntList's structure.
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}

	/* The first element (if it exists) is at sentinal.next.*/
	private IntNode sentinal;
	private int size;
	private IntNode last;


/*	In this constructor, instantiate and create a new SLList which contains x as its first element.

	public SLList(int x){
		first = new IntNode(x, null);
		size = 1;
	}*/
	public SLList(){
		sentinal = new IntNode(61, null);
		size = 0;
	}

	public SLList(int x){
		sentinal = new IntNode(61, null);
		sentinal.next = new IntNode(x, null);
		size = 1;
	}


	/** Adds x to the front of the list. */
	public void addFirst(int x){
		sentinal.next = new IntNode(x, sentinal.next);
		size += 1;
	}

	/** Return the first element in the list. */
	public int getFirst(){
		return sentinal.next.item;
	}


	public void addLast(int x){
		/*IntNode p = sentinal;

		while(p.next != null){
			p = p.next;
			}
		p.next = new IntNode(x, null);

		size += 1;
		}*/

		last.next = new IntNode(x, null);
		last = last.next;
		size += 1;
		/*
		if(first == null)
			return;
		IntNode p = first;
		while(p.next != null){
			p = p.next;
			}
		p.next = new IntNode(x, null);

		size += 1;
		*/
	}


	/** Returns the size of the list theat starts at IntNode p.
	And this is a helper method that interacts with the underlying naked recursive data structure.
	*/
	
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
		return size;
	}




	public static void main(String[] args){
		SLList L = new SLList(); //There is no need to specify null.

		L.addLast(20);
		L.size();
		System.out.println(L.size());
	}	
}
