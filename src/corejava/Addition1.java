package corejava;
import java.util.Scanner;

public class Addition1 {
    int a, b, c;
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + c);
    }
    public static void main(String[] args) {
        Addition1 obj = new Addition1();
        obj.add();
    }
}
