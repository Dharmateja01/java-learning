package Strings;

public class StringBuilderOper {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // 1. append()
        sb.append(" Java");
        System.out.println("After append: " + sb);
        // 2. insert()
        sb.insert(6, "World ");
        System.out.println("After insert: " + sb);
        // 3. charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));
        // 4. setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);
        // 5. delete()
        sb.delete(6, 12);
        System.out.println("After delete: " + sb);
        // 6. replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        // 7. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
        // 8. length()
        System.out.println("Length: " + sb.length());
        // 9. Convert StringBuilder to String
        String result = sb.toString();
        System.out.println("String: " + result);
    }
}
