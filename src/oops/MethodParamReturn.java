package oops;

public class MethodParamReturn {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodParamReturn obj = new MethodParamReturn();
        int sum = obj.add(10, 20);
        System.out.println("Sum is: " + sum);
    }
}
