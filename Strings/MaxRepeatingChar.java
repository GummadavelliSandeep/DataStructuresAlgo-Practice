import java.util.*;
public class MaxRepeatingChar {
    public static void main(String[] args) {
        String str="helloworld";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int maxvalue=0;
        char c=' ';
        List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer>o1,Map.Entry<Character,Integer>o2){
                return o2.getValue().compareTo(o1.getValue());
            }

        });
        for(Map.Entry<Character,Integer>hs1:list){
            System.out.println(hs1.getKey());
            break;
        }
//        for(Map.Entry<Character,Integer>hs:map.entrySet()){
//            if(hs.getValue()>maxvalue){
//                maxvalue=hs.getValue();
//                c=hs.getKey();
//            }
//        }
//        System.out.println(c);
    }
}
