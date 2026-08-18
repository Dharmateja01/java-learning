package exceptionhandling;
import java.util.Scanner;

public class Multiplecatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try {
            System.out.println(n / 0);

            int arr[] ={1, 2, 3, 4, 5};
            System.out.println(arr[7]);

            String str = null;
            System.out.println(str.length());

            String str1 = "++91-63006-38631";
            int num = Integer.parseInt(str1);
            System.out.println(num);
        }
        catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }
}

