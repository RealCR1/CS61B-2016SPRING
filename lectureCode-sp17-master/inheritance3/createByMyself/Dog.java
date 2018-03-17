public class Dog implements OurComparable {
	public String name;
	public int size;

	public Dog(String n, int s) {
		this.name = n;
		this.size = s;
	}

	public void bark() {
		System.out.println(name + " says: bark!");
	}

	public int compareTo(Object o) {
		Dog udog = (Dog) o;

		return this.size - udog.size;

/*		if (this.size < udog.size) {
			return -1;
		} else if (this.size == udog.size) {
			return 0;
		}
		return 1;*/
	}

}