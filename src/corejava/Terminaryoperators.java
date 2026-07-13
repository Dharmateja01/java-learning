package corejava;

public class Terminaryoperators {
    public static void main(String[] args) {
        int a=61;
        int b=15;
        int c=55;
        int d=71;
        int e=65;
        int f=7;
        String result=a>b && a>c && a>d && a>e && a>f?"a is greater":b>c && b>d && b>e && b>f?"b is greater":c>d && c>e && c>f?"c is greater":d>e && d>f?"d is greater":e>f?"e is greater":"f is greater";
//      String result=a>b && a>c?"a is greater":b>c?"b is greater":"c is greater";
        System.out.println(result);
    }
}
