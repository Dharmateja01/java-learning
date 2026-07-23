package oops;

public class ConstructorChaining {
    public ConstructorChaining() {
        this(10);
        System.out.println("Default constructor");
    }
    public ConstructorChaining(int a) {
        this(10, 20);
        System.out.println("constructor with one argument: " + a);
    }
    public ConstructorChaining(int a, int b) {
        this(10, "Hello");
        System.out.println("constructor with two arguments: " + a + ", " + b);
    }
    public ConstructorChaining(int a,String b){
        System.out.println("constructor with two arguments: " + a + ", " + b);
    }
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
    }
}
