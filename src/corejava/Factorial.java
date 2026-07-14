package corejava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 1;
        int a=1;
        while(a<=n){
            sum=sum*a;
            a++;

        }
        System.out.println("Factorial is: " + sum);
        }

}
