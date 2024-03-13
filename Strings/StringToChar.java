public class StringToChar {
    public static void main(String[] args) {
        String str="Hello welcome to java programming language";
        char[] charArray=str.toCharArray();
        for(char c:charArray){
            System.out.println(c);
        }
    }
}
