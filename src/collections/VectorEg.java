package collections;

import java.util.Vector;

public class VectorEg {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println("Vector: " + v);
        System.out.println("Size: " + v.size());
        v.add(1, 15);
        System.out.println("After insertion: " + v);
        v.remove(2);
        System.out.println("After removal: " + v);
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());
    }
}
