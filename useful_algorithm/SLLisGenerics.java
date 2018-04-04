public class SLListGenerics<Type> {
	public class TypeNode {
		public Type item;
		public TypeNode next;

		public TypeNode(Type i, TypeNode n) {
			item = i;
			next = n;
		}
	}

	private TypeNode first;
	private int size;

	public void addFirst(Type x) {
		first = new TypeNode(x, first);
		size += 1;
	}

	public Type getFirst() {
		return first.item;
	}

	public void addLast(Type x) {
		TypeNode p = first;

		while (p.next != null) {
			p = p.next;
		}
		p.next = new TypeNode(x, null);

		size += 1;
	}

	public int size() {
		return size;
	}


}