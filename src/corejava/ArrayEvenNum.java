package corejava;
import java.util.Scanner;
public class ArrayEvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]={10,11,12,13,14,15,16,17,18,19};
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2==0){
                System.out.println(ar[i]);
                count++;
            }
        }
        System.out.println("Total even numbers are: "+count);
    }
}
