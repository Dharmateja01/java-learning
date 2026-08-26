package collections;
import java.util.*;

public class ArraylistEg {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(3,80);

        System.out.println(numbers);
        System.out.println(numbers.get(1));
        numbers.set(1, 200);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(30));
        try {
            System.out.println(numbers.get(4));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
