import java.util.HashMap;
import java.util.StringTokenizer;
public class StringTokenzier {
        public static void main(String args[]){
            String str="hello welcome to to javatpoint";
//            String str2[]=str.split(" ");
//           HashMap<String,Integer>hs=new HashMap<>();
//            for(String str3:str2){
//                System.out.println(str3);
//            }
//            for(int i=0;i<str2.length;i++){
//                if(!hs.containsKey(str2[i])){
//                    hs.put(str2[i],1);
//                }
//                else{
//                    hs.put(str2[i],hs.get(str2[i])+1);
//                }
//            }
//            for(String str3:hs.keySet()){
//                if(hs.get(str3)>=2){
//                    System.out.println(str3);
//                }
//            }
            StringTokenizer st = new StringTokenizer(str," ");
            HashMap<String,Integer>hs1=new HashMap<>();
            while (st.hasMoreTokens()) {
                String str3=st.nextToken();
//                System.out.println(str3+" ");
                if(!hs1.containsKey(str3)){
                    hs1.put(str3,1);
                }
                else{
                    hs1.put(str3,hs1.get(str3)+1);
                }
            }
            for(String str1:hs1.keySet()) {
                if (hs1.get(str1) >= 2) {
                    System.out.println(str1);
                }

            }
        }
    }
