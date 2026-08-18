package exceptionhandling;
import java.util.Scanner;

public class ExceptionHandleStringOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        try {
            // Attempt to access a character at an invalid index
            System.out.println("enter the index of the character you want to access");
            int index= sc.nextInt();
            char ch = str.charAt(index);
            System.out.println("Character at index 20: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
