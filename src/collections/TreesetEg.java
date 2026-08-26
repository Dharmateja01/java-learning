package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetEg {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        h.add(50);
        h.add(70);
        h.add(20);
        h.add(30);
        h.add(20);
        h.add(10);
        h.add(30);
        System.out.println(h);
    }
}
