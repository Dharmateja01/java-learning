package collections;
import java.util.*;
public class IteratorEg {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(30);
        System.out.println(a);
        Iterator<Integer> it=a.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
