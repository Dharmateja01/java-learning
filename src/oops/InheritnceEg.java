package oops;

class InheritnceEg {
    int a = 10;
    String name = "Java";
    public static void p() {
        System.out.println("This method is from parent class.");
    }
    public static class Child extends InheritnceEg {
        int b = 20;
        String s = "Full Stack";
        public static void c() {
            System.out.println("This method is from child class.");
        }
    }
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.a);
        System.out.println(child.b);
        System.out.println(child.name);
        System.out.println(child.s);
        child.p();
        child.c();
    }
}

