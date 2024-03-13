import java.util.*;
public class Wastonandack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        while(t-->0) {
            int n = str.length();
            str = swap(str, n);
        }
        System.out.println(str);
    }

    public static String swap(String str, int n) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++){
            if(i%2==0){
                sb.append(str.charAt(i));
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i%2!=0){
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
