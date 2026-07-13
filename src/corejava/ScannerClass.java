package corejava;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("enter your age: ");
        int age=sc.nextInt();
        System.out.println("your name is: "+name);
        System.out.println("your age is: "+age);
    }
}
