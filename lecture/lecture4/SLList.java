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
		//Just like IntList's structure.
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}

	public IntNode first;
	private int size;


/*	In this constructor, instantiate and create a new SLList which contains x as its first element.

	public SLList(int x){
		first = new IntNode(x, null);
		size = 1;
	}*/
	public SLList(){
		first = null;
		size = 0;
	}


	/** Adds x to the front of the list. */
	public void addFirst(int x){
		 first = new IntNode(x, first);
		 size += 1;
	}

	/** Return the first element in the list. */
	public int getFirst(){
		return first.item;
	}


	public void addLast(int x){
		if(first == null){
			first = new IntNode(x, null);	
		}
		else{

			IntNode p = first;

			while(p.next != null){
				p = p.next;
				}
			p.next = new IntNode(x, null);

			size += 1;
		}
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
