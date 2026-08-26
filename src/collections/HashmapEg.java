package collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapEg  {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Teja");
        students.put(102, "Ravi");
        students.put(103, "Anil");
        System.out.println("Student with ID 102: " + students.get(102));
        System.out.println("Contains ID 101: " + students.containsKey(101));
        students.remove(103);
        System.out.println("Map: " + students);
        System.out.println("Keys: " + students.keySet());
        System.out.println("Values: " + students.values());
        System.out.println("Size: " + students.size());
    }
}
