package corejava;
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        int count=0;
        int temp1=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.out.println(count);
        while (n > 0) {
            int rem = n % 10;
            int mul = 1;
            for (int i = 1; i <= count; i++) {
                mul = mul * rem;
            }
            sum = sum + mul;
            n = n / 10;
        }
//        while(n>0){
//            int rem=n%10;
//            for(int i=1;i<=count;i++){
//                sum=sum+(rem*count);
//            }
//            n=n/10;
//        }
        System.out.println(sum);
        if(sum==temp1){
            System.out.println(temp1+" is an Armstrong number");
        }else{
            System.out.println(temp1+" is not an Armstrong number");
        }



//        int sum=0;
//        int temp=n;
//        while(n>0){
//            int rem=n%10;
//            sum=sum+rem*rem*rem;
//            n=n/10;
//        }
//        if(sum==temp){
//            System.out.println(temp+" is an Armstrong number");
//        }else{
//            System.out.println(temp+" is not an Armstrong number");
//        }
    }
}
