import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        String ss="aaaabbaa";
        sub("", ss);
        String s3="";
        for(String s1:list1) {
            StringBuffer bf = new StringBuffer();
            bf.append(s1);
            String s2 = new String(bf.reverse());
            if (s1.contentEquals(s2) && s2.length()>s3.length() && ss.contains(s2)) {
                s3=new String(s2);
            }
        }
        System.out.println(s3);
//        System.out.println(list1);
    }

    static List<String> list1 = new ArrayList<>();

    static void sub(String p, String up) {
        if (up.isEmpty()) {
            list1.add(p);
//            System.out.println(p+" ");
            return;

        }
        char ch = up.charAt(0);
        sub(p + ch, up.substring(1));
        sub(p, up.substring(1));
    }
}
