package corejava;
import java.util.Scanner;
public class ArrayEg {
    public static void main(String[] args) {
        int rollno[]={1,2,3,4,5};
        System.out.println("size of array : "+rollno.length);
        for(int i=0;i<rollno.length;i++){
            System.out.println(rollno[i]);
        }
        //using for each loop,no need to use index and find the size of array
//        for(int a:rollno){
//            System.out.println(a);
//        }
    }
}
