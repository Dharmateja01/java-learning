package corejava;
import java.util.Scanner;
public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp=n;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        while (temp > 0) {
            int rem = temp% 10;
            product= product * rem;
            temp= temp/ 10;

        }
        if(product==sum){
            System.out.println("spy number");
        }else{
            System.out.println("not a spy");
        }

    }
}
