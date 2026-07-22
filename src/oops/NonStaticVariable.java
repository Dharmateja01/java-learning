package oops;

public class NonStaticVariable {
    int a=10;
    String name="Java";
    public static void main(String[] args) {
        NonStaticVariable NSV=new NonStaticVariable();
        System.out.println(NSV.a);
        System.out.println(NSV.name);
    }
}
