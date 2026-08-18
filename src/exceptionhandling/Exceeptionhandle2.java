package exceptionhandling;
import java.util.Scanner;

public class Exceeptionhandle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numetrator: ");
        int n=sc.nextInt();
        System.out.println("enter a divider: ");
        int d=sc.nextInt();
        try{
            int result=n/d;
            System.out.println("result is: "+result);
        }catch(Exception e){
            System.out.println("cannot divide by zero");
        }
    }


}
