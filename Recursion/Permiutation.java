import java.util.ArrayList;

public class Permiutation {
    public static void main(String[] args) {
        ArrayList<String>ans=perimutationList("","abc");
//        Collections.sort(ans);
        System.out.println(ans);
        System.out.println(perimutationcount("","7195"));
    }
    static ArrayList<String>list=new ArrayList<>();
    static void perimutation(String p,String up) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }
        char c = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            perimutation(f + c + s, up.substring(1));
        }
    }
        static ArrayList<String> perimutationList(String p, String up){
            if(up.isEmpty()){
               ArrayList<String>list=new ArrayList<>();
               list.add(p);
               return list;
            }
            ArrayList<String>ans=new ArrayList<>();
            char c=up.charAt(0);
            for(int i=0;i<=p.length();i++) {
                String f = p.substring(0, i);
                String s = p.substring(i, p.length());
                ans.addAll(perimutationList(f + c + s, up.substring(1)));

            }
            return ans;

        }
    static int perimutationcount(String p,String up) {
        if (up.isEmpty()) {
           return 1;
        }
        char c = up.charAt(0);
        int count=0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
          count+=perimutationcount(f + c + s, up.substring(1));
        }
        return count;
    }
}
