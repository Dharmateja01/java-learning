package oops;

public class PolymorphimsmCompileTime {
    public void add(){
        System.out.println("Method with no parameters");
    }
    public void add(int a){
        System.out.println("one parameter:"+a);
    }
    public void add(int a,int b) {
        System.out.println("two parameters:"+a+","+b);
    }
    public void add(double a,String b) {
        System.out.println("two different parameters:"+a+","+b);
    }
    public void add(String b,double a) {
        System.out.println("position shifted of parameters:"+b+","+a);
    }
    public int add(int a,int b,int c) {
        int result = a+b+c;
        System.out.println("Sum of three integers:"+result);
        return result;
    }
    public static void main(String[] args) {
        PolymorphimsmCompileTime p=new PolymorphimsmCompileTime();
        p.add();
        p.add(5);
        p.add(5, 10);
        p.add(5.5, "Hello");
        p.add("Hello", 5.5);
        p.add(1, 2, 3);
    }
}
