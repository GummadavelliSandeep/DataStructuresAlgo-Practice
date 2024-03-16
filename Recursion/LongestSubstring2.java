import java.util.*;
public class LongestSubstring2 {
    public static void main(String[] args) {
        String s="aaba";
        ArrayList<String>ans= subseqList("",s);
        String s3="";
        for(String s1:ans) {
            StringBuffer bf = new StringBuffer();
            bf.append(s1);
            String s2 = new String(bf.reverse());
            if (s1.contentEquals(s2) && s2.length()>s3.length() && s.contains(s2)) {
                s3=new String(s2);
            }
        }
        System.out.println(s3);
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
