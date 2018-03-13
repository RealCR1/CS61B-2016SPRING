
public class Animal {
	
	protected String name, noise;
	protected int age;

	public Animal(String name, int age) {
		this.name = name;
		this.noise = "Huh?";
		this.age = age;
	}

	public String makeNoise() {
		if (age < 5) {
			return noise.toUpperCase();
		} else {
			return noise;
		}
	}

	public void greet() {
		System.out.println("Animal " + name + " says: " + makeNoise());
	}
}

	public static void main(String[] args) {
		
	}	
}