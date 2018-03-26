import java.util.Iterator;
import java.util.NoSuchElementException;

public class KthIntList implements Iterator<Integer> {
	public int k;
	private Intlist curList;
	private boolean hasNext;

	public KthIntList(Intlist I, int k) {
		this.k = k;
		this.curList = curList;
		this.hasNext = true;
	}

	public boolean hasNext() {
		return this.hasNext;
	}

	/** Returns the next Kth element of the IntList given in the constructor.
	 *  Returns the 0th element first.
	 *  Throws a NoSuchElementException if there are no Integer available to return.
	 */
	public Integer next() {
		if (curList == null) {
			throw new NoSuchElementException;
		}

		Integer returnInt = curList.first;
		for (int i = 0; i < k && curList != null; i += 1) {
			curList = curList.next;
		}
		hasNext = (curList != null);
		return returnInt;
	}

}