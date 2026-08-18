package exceptionhandling;
import java.util.*;

public class ExceptionHandleEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter two numbers to divide: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
        System.out.println("End");
    }
}
