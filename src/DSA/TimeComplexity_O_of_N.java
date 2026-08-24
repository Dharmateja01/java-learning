package DSA;

public class TimeComplexity_O_of_N {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=5;i++){
            sum=sum+1;
        }
        System.out.println(sum);
        System.out.println("time complexity Big O of n - "+"O(n)");
    }
}
