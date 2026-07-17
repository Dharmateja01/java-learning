package corejava;
import java.util.Scanner;
public class PattenPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if(j >= n-1-i && j <= n-1+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

        //            for(int j=0;j<(n-i);j++) {
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*i-1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    //}}

//        int x=n/2;

//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=n;j++){
//                if(j==x || i%2==1 ){
//                    System.out.print("* ");
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//    }
//}
//}
