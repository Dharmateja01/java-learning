package DSA;

public class Nested_Loops_O_n_square {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=3;i++){
            System.out.println("outer loop");
            for(int j=0;j<1;j++){
                System.out.println("inner loop");
            }
        }
//        System.out.println(sum);
        System.out.println("time complexity Big O of n square - "+"O(n2)");
    }
}
