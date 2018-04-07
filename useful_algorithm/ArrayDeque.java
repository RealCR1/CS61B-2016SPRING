public class ArrayDeque<Item> {
	private int size = 0;
	private int nextFirst = 0;
	private int nextLast = 1;

	private Item[] arr;

	private static final int INITIAL_CAPACITY = 8;

	//Create an empty Deque.
	public ArrayDeque() {
		arr = (Item[]) new Object[INITIAL_CAPACITY];
	}

	//Add first item as the first element in ArrayDeque.
	//So a circular array is a good idea.
	public void addFirst(Item item) {
		if (item == null) {
			throw new NullPointerException();
		}

		//Adding the item to the first of the array.
		arr[nextFirst] = item;

		if (this.nextFirst == 0) {
			nextFirst = this.length - 1;
		} else {
			this.nextFirst -= 1;
		}
		size += 1;

		if (size == arr.length) {
			this.resize(arr.length * 2);
		}
	}

	public void addLast(Item item) {
		if (item == null) {
			throw new NullPointerException();
		}

		arr[nextLast] = item;
		nextLast = (nextLast + 1) % (this.arr.length - 1);

		size += 1;

		if (size == arr.length) {
			this.resize(arr.length * 2);
		}
	}
}