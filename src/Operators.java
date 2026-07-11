public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        int c=++a + b++;
//        int d=++b + a++;
//        int e=--c - --d +--a - --b;
        int c=++a + b++ / a++ * --b;
        int d=++b + a++ * a++ / --a;
        int e=--c - --d +--a - --b % ++d * ++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
