package corejava;

public class ArraySmallest {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 10, 7 };
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest number in the array is: "+smallest);
    }
}
