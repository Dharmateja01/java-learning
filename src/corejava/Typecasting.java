package corejava;

public class Typecasting {
    public static void main(String[] args) {
        int a=300;
        // byte b=a;
        // b=a;//not posssible dute to int to byte
        //a=b; //possible as it is converted to int from byte (implict) conversion
        byte b=(byte) a;//explecit conversion
        // System.out.println(a);
        System.out.println(b);
        float f=5.7f;
        int i=(int)f;
        System.out.println(i);
    }
}
