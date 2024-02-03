import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       System.out.println(gcd(a,b));
//        int res=Math.max(a,b);
//        while(res>0){
//            if(a%res==0 && b%res==0){
//                break;
//            }
//            res--;
//        }
//        System.out.println(res);
//  ----------------- method=2-----------------------------------------
//        while(a!=b){
//            if(a>b){
//                a=a-b;
//            }
//            else{
//                b=b-a;
//            }
//        }
//        System.out.println(a);

        }
//====================method-3==================================
    public static int gcd(int a, int b) {
    if(b==0){
        return a;
    }
    else{
        return gcd(b,a%b);
    }
    }
}
