public class ReverseVowelsUsingTwoPointers {
    public static void main(String[] args) {
        String str = "hello world";
        char ch[] = str.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j && !isvowel(ch[i])) {
            i++;
        }
        while (i < j && !isvowel(ch[j])) {
            j--;
        }
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        String res = String.valueOf(ch);
        System.out.println(res);
    }

    private static boolean isvowel(char ch) {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}