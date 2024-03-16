import java.util.ArrayList;
import java.util.HashSet;

public class substrings {

    public static void main(String[] args) {
        ArrayList<String>ans=subseqList("","abab");
        System.out.println(ans);
        int count=0;
        System.out.print(list);
        HashSet<String>hs=new HashSet<>();
        for(String s1:ans){
            hs.add(s1);
        }
        System.out.println(hs);
        System.out.println(hs.size());
       for(int i=0;i<list.size();i++){
           if((list.get(i).contentEquals("HSL"))){
               count++;
           }
//          String str=list.get(i);
//          if(str.startsWith("HSL")){
//              count++;
//          }
       }
        System.out.println();
        System.out.println(count);
    }
    static ArrayList<String >list=new ArrayList<>();
    static void subseq(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subseqList(String p, String up){
        if(up.isEmpty()){
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
           return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseqList(p+ch,up.substring(1));
        ArrayList<String>right=subseqList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
