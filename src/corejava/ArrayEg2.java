package corejava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ArrayEg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter values in array ");
        for(int i=0;i<arr.length;i++){
            int value= sc.nextInt();
            arr[i]=value;
        }
        for(int a:arr){
            System.out.print(a);
        }




    }
}
