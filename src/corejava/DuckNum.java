package corejava;
import java.util.Scanner;
public class DuckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        boolean isDuck = false;
        while (temp > 0) {
            int rem = temp % 10;
            if (rem == 0) {
                isDuck = true;
                break;

            }
            temp = temp / 10;
        }
        if (isDuck) {
            System.out.println("The number is a Duck Number");
        } else {
            System.out.println("The number is not a Duck Number");
        }
    }
}
        //without using a boolean value
       // /// ///////////////////////////
//        int temp = n;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 0) {
//                System.out.println("The number is a Duck Number");
//                break;
//            }
//            n = n / 10;
//        }
//        if (n == 0) {
//            System.out.println("The number is not a Duck Number");
//        }
//    }
//
//}
