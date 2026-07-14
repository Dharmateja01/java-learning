package corejava;

import java.util.Scanner;

public class WhileLoopEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter N value : ");
        int n=sc.nextInt();
        System.out.println("enter M value : ");
        int m=sc.nextInt();
        while(n>=m){
            System.out.println(n);
            n--;

        //sum ofcontinous numbers
//            System.out.println("enter the number to find sum of first N numbers: ");
//            int n1=sc.nextInt();
//            int a=1;
//            int sum=0;
//            while(a<=n1){
//                sum=sum+a;
//                a++;
//            }
//            System.out.println("sum of first "+n1+" numbers is: "+sum);


//            int a=1;
//            while(a<=5)
//            {
//                System.out.println("hello " + a);
//                a++;
//                int j=1;
//                while(j<=3){
//                    System.out.println("hi "+j);
//                    j++;
//                }
//            }
        }
    }
}
