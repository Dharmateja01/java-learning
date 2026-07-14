package corejava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month name: ");
        String month=sc.nextLine();
        switch (month){
            case "January":
                System.out.println("month number is :" + 1);
                break;
            case "February":
                System.out.println("month number is :" + 2);
                break;
            case "March":
                System.out.println("month number is :" + 3);
                break;
            case "April":
                System.out.println("month number is :" + 4);
                break;
            case "May":
                System.out.println("month number is :" + 5);
                break;
            default:
                System.out.println("enter valid month name");
        }
//        System.out.println("enter the month number: ");
//        int num=sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("month name is :" + "January");
//                break;
//            case 2:
//                System.out.println("month name is :" + "February");
//                break;
//            case 3:
//                System.out.println("month name is :" + "March");
//                break;
//            case 4:
//                System.out.println("month name is :" + "April");
//                break;
//            case 5:
//                System.out.println("month name is :" + "May");
//                break;
//            default:
//                System.out.println("enter valid month number");
        }
    }

