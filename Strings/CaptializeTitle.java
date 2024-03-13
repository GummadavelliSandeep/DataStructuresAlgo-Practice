import java.util.*;
public class CaptializeTitle {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        String str="capiTalIze tHe titLe";
        String str1[]=str.split(" ");
        for(String s:str1){
            if(s.length()<2){
                sb.append(s.toLowerCase()+" ");
            }
            else{
                sb.append(s.substring(0,1).toUpperCase());
                sb.append(s.substring(1).toLowerCase()+" ");
            }
        }
        System.out.println(sb.toString());
    }
}
