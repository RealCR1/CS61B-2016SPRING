public class SLList<Lochness> {

	public class IntNode {
		public Lochness item;
		public IntNode next;

		public IntNode(Lochness i, IntNode n) {
			item = i;
			next = n;
		}
	}

	private Lochness first;
	private int size; //The type of size is always int.

	public SLList(Lochness x) {
		first = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		sentinal.next = new IntNode(x, sentinal.next);
		size += 1;
	}

	public int getFirst() {
		return sentinal.next.item;
	}

	public void addLast(int x) {
		//To reduce the complexity. 
		//Introduce the sentinal Node to make sure all list will not be empty.

		IntNode p = sentinal;
		while (p.next != null) {
			p = p.next;
		}

		p.next = new IntNode(x, null);
		size += 1;
	}

	public int size(IntNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}
}