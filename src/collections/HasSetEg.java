package collections;
import java.util.HashSet;
public class HasSetEg {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(20);
        h.add(50);
        h.add(10);
        System.out.println(h);
    }
}
