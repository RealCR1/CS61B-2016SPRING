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

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void resize(int number) {
		int n = arr.length;
		Item[] new_arr = (Item[]) new Object[number];
		int pointer = 0;
		while (arr[pointer] == null) {
			pointer += 1;
		}
		System.arraycopy(this.arr, pointer, new_arr, 0, size));
		arr = new_arr;
		nextFirst = number - 1;
		nextLast = n;
	}

	public Item removeFirst() {
		if (size == 0) {
			return null;
		}
		Item item;
		if (nextFirst == arr.length - 1) {
			item = (Item) arr[0];
			arr[0] = null;
			nextFirst = 0;
		} else {
			item = (Item) arr[nextFirst + 1];
			arr[nextFirst + 1] = null;
			nextFirst -= 1;
		}

		size -= 1;

		if (size == arr.length / 4 && size == 0 && arr.length >= 16) {
			this.resize(arr.length / 2);
		}

		return item;
	}
}