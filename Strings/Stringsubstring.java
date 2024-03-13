import java.util.Arrays;

public class Stringsubstring {
    public static void main(String[] args) {
        String str="hello world abbc";
//        String str1[]=str.split(" ");
//        System.out.println(Arrays.toString(str1));
        String s="abb";
        if(str.contains(s)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
}
