import java.lang.reflect.Array;
import java.util.*;

public class stringVowelsReverse {
    public static void main(String[] args) {
        List<Character> list=Arrays.asList('a', 'e', 'i','o','u','A','E','I','O','U');
//        System.out.println(list);
        String str="hello world";
        char ch[]=str.toCharArray();
        int i=0,j=ch.length-1;
//        System.out.println(Arrays.toString(ch));
        while(i<j){
            if(list.contains(ch[i]) && list.contains(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(!list.contains(ch[i]) && list.contains(ch[j])){
                i++;
            }
            else if(list.contains(ch[i]) && !list.contains(ch[j])){
                j--;
            }
            else if (!list.contains(ch[i]) && !list.contains(ch[j])){
                i++;
                j--;
            }
        }
        String res=String.valueOf(ch);
        System.out.println(ch);


    }
}
