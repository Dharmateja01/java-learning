package corejava;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("student grade Calculator:");
        System.out.println("---------------------------");
        System.out.println("enter the marks of student:");
        int marks= sc.nextInt();
        if(marks>=90 && marks<=100) {
            System.out.println("Grade A");
        }
        else if(marks>=75 && marks<90) {
            System.out.println("Grade B");
        }
        else if(marks>=60 && marks<74) {
            System.out.println("Grade C");
        }
        else if(marks>=35 && marks<60) {
            System.out.println("Grade D");
        }
        else if(marks<35) {
            System.out.println("Failed");
        }
        else {
            System.out.println("enter valid marks");
        }
    }
}