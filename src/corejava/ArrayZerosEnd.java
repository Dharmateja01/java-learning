package corejava;
import java.util.Scanner;

public class ArrayZerosEnd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements int the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[index] = arr[j];
                index++;
            }
        }
        while (index < size) {
            arr[index] = 0;
            index++;
        }
        for (int n : arr) {
//            System.out.println("all the zeros are moved for last");
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("all the zeros are moved for last");
    }
}
