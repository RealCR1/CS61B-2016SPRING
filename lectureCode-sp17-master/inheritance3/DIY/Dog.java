import java.util.Comparator;


public class Dog implements OurComparable<Dog>{
    private String name;
    private int size;

    private Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }
    
    public int compareTo(Dog udog) {
        return this.size - udog.size;
    }

    /** When we want to compareTo other variables
     *  Such as dog's name,
     *  We should instantiate other compare method to accomplish.*/
    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }
    
    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }
    
    




}