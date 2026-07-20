package corejava;

public class Array2ndLargest {
    public static void main(String[] args) {
        int[] arr = {10, 60,20, 80, 40, 50,90,100,95};
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest number is: " + max2);
    }
}












//        int[] arr = {10, 20, 80, 40, 50};
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//
//        }
//    }
//}
