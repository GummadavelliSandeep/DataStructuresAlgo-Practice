import java.util.*;
public class StringSortDesc {
    public static void main(String[] args) {
        String str="geeks";
        ArrayList<Character>list=new ArrayList<>();
        char c[]=str.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        String str1="";
        for(int i=c.length-1;i>=0;i--){
            str1=str1+String.valueOf(c[i]);
        }
        System.out.println(str1);
////        for(int i=0;i<list.size();i++){
////            str1=str1+String.valueOf(c[i]);
////        }
    }
}
