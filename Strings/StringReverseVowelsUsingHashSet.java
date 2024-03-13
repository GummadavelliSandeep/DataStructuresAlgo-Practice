import java.util.HashSet;

public class StringReverseVowelsUsingHashSet {
    public static void main(String[] args) {
        String str = "Hello world";
        char ch[] = str.toCharArray();
        int i=0,j=ch.length-1;
        HashSet<Character>hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        while(i<j) {
            if (hs.contains(ch[i]) && hs.contains(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(!hs.contains(ch[i]) && hs.contains(ch[j])){
                i++;
            }
            else if(hs.contains(ch[i]) && !hs.contains(ch[j])){
                j--;
            }
            else if(!hs.contains(ch[i]) && !hs.contains(ch[j])){
                i++;
                j--;
            }
        }
        System.out.println(" "+ch);
        String res=String.valueOf(ch);
        System.out.println(res);
    }
}