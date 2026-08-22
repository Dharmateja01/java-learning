package java8;

public class LambdaExpression implements Lambda1 {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Lambda1 addition = (a,b)->a+b;
        int result = addition.calculate(10, 20);
        System.out.println(result);
    }
}
