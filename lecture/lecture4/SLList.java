/* An SLList is a list of integers
 * Hides the terrible truth of nakeness.
 */
public class SLList {
	public IntNode first;

	public SLList(int x){
		first = new IntNode(x, null);
	}
	

	public static void main(String[] args){
		SLList L = new SLList(10); //There is no need to specify null.
	}	

	/** Adds x to the front of the list. */
	public void addFirst(int x){
		 first = new IntNode(x, first);

	}
}