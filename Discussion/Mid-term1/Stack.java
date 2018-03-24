public interface Stack<Item> {
	void push(Item x);
	Item pop();
	int size();

	default void purge(Item x) {
		if (size() == 0) {
			return;
		}
		Item top = pop();
		purge(x);
		if (!x.equals(top)) {
			push(x);
		}

	}
}