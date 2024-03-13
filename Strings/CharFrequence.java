import java.util.HashMap;
import java.util.Map;

public class CharFrequence {
    public static void main(String[] args) {
        String str="this sandeepe hello";
        char c='e';
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c1=str.charAt(i);
            map.put(c1,map.getOrDefault(c1,0)+1);
        }
        int count=0;
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            if(e.getKey()==c){
                count=e.getValue();
            }
        }
        System.out.println(count);
    }
}
