import java.util.Comparator;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 9);
        Dog d3 = new Dog("Benjamin", 15);
        Dog[] dogs = new Dog[]{d1, d2, d3};
        
        System.out.println(Maximizer.max(dogs));
        Dog d = (Dog) Maximizer.max(dogs);

        Comparator<Dog> nc = Dog.getNameComparator();
        if (nc.compare(d2, d1) > 0) {
            d2.bark();
        } else {
            d1.bark();
        }
    }
}
