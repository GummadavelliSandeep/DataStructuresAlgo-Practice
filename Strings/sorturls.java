import java.util.*;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

public class sorturls {
    public static void main(String[] args) {
        String s[]={"https://www.youtube.com","https://www.hackerrank.com","https://www.hackerrank.com","https://www.google.com","https://www.google.com"};
        HashMap<String,Integer>hm=new HashMap<>();
        ArrayList<HashMap> arrayList = new ArrayList<>();
        HashSet<String>hs=new HashSet<>();
        for(int i=0;i<s.length;i++){
            if(!hm.containsKey(s[i])){
                hm.put(s[i],1);
            }
            else {
                hm.put(s[i],hm.get(s[i])+1);
            }
        }
        for (Map.Entry entry : hm.entrySet()) {
            arrayList.add((HashMap) entry);
        }
        System.out.println(arrayList);

    }
}
