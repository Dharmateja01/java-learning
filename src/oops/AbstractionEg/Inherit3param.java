package oops.AbstractionEg;

public class Inherit3param implements InheritMethodParam, Inherit2param{
    @Override
    public void display(String name, int age){
        System.out.println("Name: " + name + ", Age: " + age+" from 1");
    }
    @Override
    public int add(int a, int b){
        return a+b;
//        System.out.println("from 2");
    }
    public static void main(String[] args) {
        Inherit3param obj = new Inherit3param();
        obj.display("John", 25);
        System.out.println("Sum from Inherit3param: " + obj.add(10, 20));
        Inherit3param obj2 = new Inherit3param();
        obj2.display("Alice", 30);
        System.out.println("Sum from Inherit3param: " + obj2.add(5, 15));
        //        InheritMethodParam obj1 = new Inherit3param();
//        InheritMethodParam.display("Alice", 30);;
////        Inherit2param obj2 = new Inherit3param();
//        int sum2 = Inherit2param.add(5, 15);
//        System.out.println("Sum from Inherit2param: " + sum2);
    }
}
