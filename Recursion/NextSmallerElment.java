import java.util.ArrayList;

public class NextSmallerElment {

    public static void main(String[] args) {
        ArrayList<String>list=subseqList("","25");
        ArrayList<Integer>list1=new ArrayList<>();
        int min=2;
        int ans=Integer.MAX_VALUE;
       for(int i=0;i<list.size();i++){
           if(list.get(i)==""){
               continue;
           }
           int digitcount=list.get(i).length();
           int digit=Integer.parseInt(list.get(i));
           if(((digitcount ==(int)Math.log10(min)+1 && digit>min))){
               list1.add(digit);
           }
       }
       for(int i:list1){
           if(i<ans){
               ans=i;
           }
       }
        System.out.println(list1);
        System.out.println(ans);

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
