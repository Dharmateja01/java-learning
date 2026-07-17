package corejava;
import java.util.Scanner;
public class ArrayNewKetword {
    public static void main(String[] args) {
        System.out.println("enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int rollno[]=new int[size];
        System.out.println("enter the value to be inserted in array: ");
        for(int i=0;i<size;i++){
            int value=sc.nextInt();
            rollno[i]=value;
        }
        for(int arr:rollno){
            System.out.print(arr+" ");
        }
    }
}
