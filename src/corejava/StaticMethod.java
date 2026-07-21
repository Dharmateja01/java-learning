package corejava;

public class StaticMethod {
    public static void greet(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        greet();
        StaticMethod.greet();
    }
}
