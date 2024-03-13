import java.util.*;
public class AlternativeVowelNdConsontant {
    public static void main(String[] args) {
//        String s= "this-text? has some special & symbols in it *";
//        String S="aeiouhello";
//        String str1= S.replaceAll("[^aeiouAEIOU]","");
//        /*removes every character from the string if it is present in the give string */
//        String str2=S.replaceAll("aer","");
//        /*removes and replaces only the particular string as mentioned in regex if it is present in the string in continuously in the given string */
//        String str3=s.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(str3);
//        System.out.println(str2);
//        System.out.println(str1);
        String s = "aeroplane";
        String str1 = s.replaceAll("[aeiouAEIOU]", "");
        String str2 = s.replaceAll("[^aeiouAEIOU]", "");
        Queue<Character> vow = new LinkedList<>();
        Queue<Character> cons = new LinkedList<>();
        for (int i = 0; i < str2.length(); i++) {
            vow.offer(str2.charAt(i));
        }
        for (int i = 0; i < str1.length(); i++) {
            cons.offer(str1.charAt(i));
        }
        System.out.println(cons);
        System.out.println(vow);
        String str3="";
        int i=0;
        while(i<s.length())
        {
            if(!vow.isEmpty()){
                str3=str3+vow.remove();
                i++;
            }
            if(cons.isEmpty()){
                str3=str3+cons.remove();
                i++;
            }
        }
        System.out.println(str3+"hello");
    }
}
