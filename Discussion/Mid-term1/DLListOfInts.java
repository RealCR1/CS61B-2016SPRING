public class DLListOfInts implements ListOfInts {
	public class IntNode {
		public int Item;
		public IntNode next, pre;
	}

	public IntNode sentinal;
	public int size;

	public void plusEquals(DLListOfInts x) {
		if (x == null || this.size() != x.size()) {
			return;
		}
		IntNode xPtr = x.sentinal.next;
		//Couldn't solve it.
		//Based on solution from Internet.
		for (IntNode p = sentinal.next; p != sentinal; p = p.next) {
			p.item += xPtr.item;
			xPtr = xPtr.next;
		}
	}
}