package corejava;

public class ReturnMethod {
    public static int multi(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int result = multi(5, 6);
        System.out.println("Multiplication is: " + result);
    }
}
