import java.util.HashSet;

public class WordsCharacterCountInString {
    public static void main(String[] args) {
        String str = "google microsoft";
        String c[] = str.split(" ");
        String s = "";
        int max_count = 0;
        for (int i = 0; i < c.length; i++) {
            String str1 = c[i];
            HashSet<Character> hs = new HashSet<>();
            for (int j = 0; j < str1.length(); j++) {
                int count = 0;
                if (!hs.contains(str1.charAt(j))) {
                    hs.add(str1.charAt(j));
                }
                else if(hs.contains(str1.charAt(j))){
                    count++;
                }
                if (count > max_count) {
                    max_count = count;
                    s = new String(str1);
                }
            }
        }
        System.out.println(s);
    }
}
