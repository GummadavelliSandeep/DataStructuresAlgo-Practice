import java.util.*;
public class CountNumberOfSubstrings {
    public static void main(String[] args) {
        int K=3;
        String s="ecbaddce";

        long totalcount=0;
        ArrayList<String>list=subseq("",s);
        for(String s1:list){
            HashSet<Character>hs=new HashSet<>();
            boolean valid=true;
            for(int i=0;i<s1.length();i++){
                if(!hs.contains(s1.charAt(i))){
                    hs.add(s1.charAt(i));
                    if(hs.size()==K){
                        totalcount++;
                    }
                }
            }
            if(valid && hs.size()==K){
                totalcount++;
            }
        }
        System.out.println(list);
        System.out.println(totalcount);
    }
    static ArrayList<String> subseq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list1=new ArrayList<>();
            list1.add(p);
            return list1;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseq(p+ch,up.substring(1));
        ArrayList<String>right=subseq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
