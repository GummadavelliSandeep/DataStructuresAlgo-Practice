import java.util.*;
public class ReverseWordsInString {
    public static void main(String[] args) {
        String s="  The sky is blue  ";
        String s1=reverseWords(s);
        String[] str = s.trim().split(" ");/*Trim is used to remove the white spaces at the starting and ending of the string in java*/
        System.out.println(Arrays.toString(str));
    }
        static String reverseWords(String s){
            String str="";
            StringTokenizer str1 = new StringTokenizer(s, " ");
            while(str1.hasMoreTokens()){
                str=str1.nextToken()+" "+str;
            }
            return str.strip();
        }

    }

