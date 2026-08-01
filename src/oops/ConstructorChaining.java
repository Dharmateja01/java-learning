package oops;

public class ConstructorChaining {
    public ConstructorChaining() {
        this(10);
        System.out.println("Default constructor");
    }
    public ConstructorChaining(int a) {
        this(10, 20);
        System.out.println("Id " + a);
    }
    public ConstructorChaining(int a, int b) {
        this(10, "Hello");
        System.out.println("Id and age : " + a + ", " + b);
    }
    public ConstructorChaining(int a,String b){
        System.out.println("ID and name: " + a + ", " + b);
    }
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
    }
}
