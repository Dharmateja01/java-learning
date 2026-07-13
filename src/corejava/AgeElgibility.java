package corejava;
import java.util.Scanner;

public class AgeElgibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to voter eligibility check");
        System.out.println("enter your Age: ");
        int age=sc.nextInt();
        if(age>=18) {
            System.out.println("you are eligible to vote");
        }
        else {
            System.out.println("you are not eligible to vote");
        }


    }
}
