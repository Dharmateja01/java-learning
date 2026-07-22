package oops;

public class ConstructorEg {
    int a;
    int b;
    public ConstructorEg(int x, int y) {
        a = x;
        b = y;
    }
    public static void main(String[] args) {
        ConstructorEg obj = new ConstructorEg(10, 20);
        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
    }
}
