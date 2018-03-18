public class Problem1 {
    public static void main(String[] args) {
        IntList a = new IntList(5, null);
        System.out.println(a.first); //print 5.
        
        IntList b = new IntList(9, null);
        IntList c = new IntList(1, new IntList(7, b));
        
        a.rest = c.rest;
        a.rest.rest = b;
        b.rest = c.rest;
        
        IntList d = new IntList(9002, b.rest.rest);
        
        System.out.println(d.rest.rest.rest.first);
        System.out.println(a.rest.first);
        
        c.rest.rest = c.rest;
        
        System.out.println(a.rest.rest.rest.rest.first);
    }
}
