package Strings;

public class SBreverse {
    public static void main(String[] args) {
        String s="java";
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }
        System.out.println(reverse);
    }
}
