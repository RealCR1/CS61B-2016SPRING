public class Problem1 {
    public static void main(String[] args) {
        IntList a = new IntList(5, null);
        System.out.println(a.first); //print 5.
        
        IntList b = new IntList(9, null);
        IntList c = new IntList(1, new IntList(7, b));
        
        a.rest = c.rest;
        a.rest.rest = b;
        b.rest = c.rest;
        
        IntList d = new IntList(9002, b.rest.rest);//9002, 9
        
        System.out.println(d.rest.rest.rest.first);  //9
        System.out.println(a.rest.first); // 7
        
        c.rest.rest = c.rest; // 1 7 7 9
        
        System.out.println(a.rest.rest.rest.rest.first);  //7
    }
}
