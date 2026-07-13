package corejava;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
// there is a error in the below code because the order of the conditions is not correct. The correct order should be:
// 400 is divisible by 100 and 4, so it should be checked first. Then check for 100, and finally check for 4. The correct order is:
//        if (year % 4 == 0){
//            System.out.println(year+"is a leap year");
//        }
//        else if (year % 100 ==0){
//            System.out.println(year+"is not a leap year");
//        }
//        else if(year % 400==0){
//            System.out.println(year+"is a leap year");
//        }
//        else{
//            System.out.println(year+" not a leap year");
//        }

//        if((year%4==0 && year%100!=0) || (year%400==0)){
//            System.out.println(year+" is a leap year.");
//        }else{
//            System.out.println(year+" is not a leap year.");
//
//        }
    }
}
