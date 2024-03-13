import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcabc";
        char ch[] = str.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < ch.length - 1; i++){
            hs.add(ch[i]);
        }
        System.out.println(hs);
        Iterator<Character>al=hs.iterator();
        while(al.hasNext()){
            System.out.print(al.next());
        }
    }
}