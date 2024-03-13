import java.util.Locale;

public class StringCountArray {
    public static void main(String[] args) {
        String s="hello";
        s=s.toLowerCase(Locale.of(s));
        System.out.println(s);
        int cnt[]=new int[256];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)]++;
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]==1){
                System.out.println((char)i);
                break;
            }
        }
    }
}
