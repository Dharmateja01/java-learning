package corejava;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int x=n/2;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==x){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            }

            System.out.println();
        }
    }
}
