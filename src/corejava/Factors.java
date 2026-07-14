package corejava;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a=1;
        while(a<=n){
            if (n%a==0){
                System.out.println(a);
            }
            a++;

        }

    }
}
