package corejava;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bonus calculator ");
        System.out.println("===============================");
        System.out.println("enter current salary of employee:");
        double salary=sc.nextDouble();
        System.out.println("enter the experience of employee:");
        double experience= sc.nextDouble();
        if(experience>10){
            System.out.println("Your bonus is "+(salary*0.2));
        }
        else if(experience>=5 && experience<=10){
            System.out.println("Your bonus is "+(salary*0.1));
        }
        else{
            System.out.println("no Bonus");
        }
    }
}
