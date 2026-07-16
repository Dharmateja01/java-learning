package corejava;
import java.util.Scanner;
public class NeonNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        int square=n*n;
        System.out.println("square of the number is : "+square);
        while(square > 0)
        {
            int rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(sum==n){
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon");
        }
    }
}
