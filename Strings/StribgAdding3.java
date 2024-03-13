public class StribgAdding3 {
    public static void main(String[] args) {
        String str="as3gAsd";
        String str1=" ";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
             str1= str1+(char)(c+3);
//             str1=String.valueOf((char)(m+3));
        }
        System.out.println(str1);
    }
}
