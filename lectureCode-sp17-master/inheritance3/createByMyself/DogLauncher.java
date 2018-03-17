public class DogLauncher {
	Dog[] dogs = new Dog[2];
	dogs[0] = Dog("Elyse", 3);
	dogs[1] = Dog("Sture", 9);
	dogs[2] = Dog("Benjamin", 15);
	System.out.println(Maximizer.max(dogs));
	Dog d = (Dog) Maximizer.max(dogs);
}