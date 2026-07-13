package corejava;

public class Terminaryoperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        String result=a>b && a>c?"a is greater":b>c?"b is greater":"c is greater";
        System.out.println(result);

    }
}
