public class Cat extends Animal {
	//Class Constructor
	public Cat(String name, int age) {
		super(name, age); //Class constructor couldn't be inherited.
		this.noise = "Meow!";
	}

	@Override
	public void greet() {
		System.out.println("Cat " + name + " says: " + makeNoise());
	}


}