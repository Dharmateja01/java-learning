package Strings;

public class Countconstants {
    public static void main(String[] args) {
        String s="Java programming";
        int Vowels=0;
        int Consonants=0;
        StringBuilder sb=new StringBuilder();
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                sb.append(s.charAt(i));
                Vowels++;
            }
            else if(Character.isLetter(s.charAt(i))){
                ss.append(s.charAt(i));
                Consonants++;
            }
        }
        System.out.println("Vovels count "+ sb+"\ncount ="+Vowels);
        System.out.println("constants count "+ss+"\ncount ="+Consonants);
    }
}
