package Strings;

public class StringOp2 {
    public static void main(String[] args) {
        String s=" Java Programming ";
        System.out.println(s);
        System.out.print(s.trim());
//        System.out.println(s.split(" "));
        String a[]= s.split(" ");
        for(String splits:a){
            System.out.println(splits);
        }

    }
}
