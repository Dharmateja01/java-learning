package oops;

public class NonStaticMethod {
    public void display() {
        System.out.println("This is a non-static method.");
    }
    public static void main(String[] args) {
        NonStaticMethod obj = new NonStaticMethod();
        obj.display();
    }
}
