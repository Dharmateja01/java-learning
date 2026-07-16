package corejava;

import java.util.Scanner;

public class NestedForPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


            //==========================================
//        for (int i = 0; i <= n; i++)
//        {
//            for (int j = 0; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        }
//    }
