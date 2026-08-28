package Strings;

public class StringsEg {
    public static void main(String[] args) {
        String s = "Hello Java";
        // 1. Length
        System.out.println("Length: " + s.length());
        // 2. Character at an index
        System.out.println("Character at index 1: " + s.charAt(1));
        // 3. Convert to uppercase
        System.out.println("Uppercase: " + s.toUpperCase());
        // 4. Convert to lowercase
        System.out.println("Lowercase: " + s.toLowerCase());
        // 5. Check if string contains something
        System.out.println("Contains Java: " + s.contains("Java"));
        // 6. Check beginning
        System.out.println("Starts with Hello: " + s.startsWith("Hello"));
        // 7. Check ending
        System.out.println("Ends with Java: " + s.endsWith("Java"));
        // 8. Find position of a character/string
        System.out.println("Index of Java: " + s.indexOf("Java"));
        // 9. Replace
        System.out.println("Replace Java: " + s.replace("Java", "World"));
        // 10. Extract part of string
        System.out.println("Substring: " + s.substring(6));
        try {
            System.out.println(s.substring(3, 20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        // 11. Remove spaces at beginning/end
        String x = "   Hello   ";
        System.out.println("Trim: [" + x.trim() + "]");
        // 12. Compare strings
        String a = "Java";
        String b = "Java";
        System.out.println("Equals: " + a.equals(b));
    }
}
