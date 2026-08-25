package collections;
import java.util.*;
public class LinkedListEg {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);
        int first=l.getFirst();
        System.out.println(first);
        System.out.println(l.getLast());
        System.out.println(l.contains(30));
        l.add(1,40);
        System.out.println(l);
        System.out.println(l.remove(0));
        System.out.println(l);
        System.out.println(l);
    }
}



















//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        System.out.println("List: " + list);
//
//        System.out.println("First element: " + list.getFirst());
//        System.out.println("Last element: " + list.getLast());
//
//        System.out.println("Element at index 1: " + list.get(1));
//
//        System.out.println("Contains 20: " + list.contains(20));
//
//        System.out.println("Index of 30: " + list.indexOf(30));
//
//        list.add(1, 15);
//        System.out.println("After add(1, 15): " + list);
//
//        list.remove(2);
//        System.out.println("After remove(2): " + list);
//    }
//}
