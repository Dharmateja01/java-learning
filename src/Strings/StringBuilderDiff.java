package Strings;

public class StringBuilderDiff {
    public static void main(String[] args) {
        int n = 50000;
        // String
        long start = System.nanoTime();
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
//        System.out.println(s);
        long end = System.nanoTime();
        System.out.println("String time: " +
                (end - start) + " ns");
        // StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
//        System.out.println(sb);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " +
                (end - start) + " ns");
    }
}
