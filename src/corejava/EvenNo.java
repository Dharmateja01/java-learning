package corejava;
import java.util.Scanner;
public class EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total even numbers are: "+count);
    }
}
