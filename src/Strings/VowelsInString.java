package Strings;

public class VowelsInString {
    public static void main(String[] args) {
        String s="Java programming";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
