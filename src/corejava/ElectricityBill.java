package corejava;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("electricity Bill calculator");
        System.out.println("============================");
        System.out.println("enter the number of units consumed:");
        Double units=sc.nextDouble();
        if(units>=100) {
            System.out.println("your electricity bill is: " + (units * 2));
        }
            else if(units>100 && units<=300) {
            System.out.println("your electricity bill is: " + (units * 3));
        }
            else if(units>300) {
            System.out.println("your electricity bill is: " + (units * 5));
        }
            else {
                System.out.println("eneter valid units ");
            }
    }
}
