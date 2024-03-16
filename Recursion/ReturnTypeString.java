public class ReturnTypeString {
    public static void main(String[] args) {
//        String str="Helloworld";
//        System.out.println(str.substring(1));
        System.out.println(skip("abcbdbac"));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else{
           return ch+skip(up.substring(1));
        }
    }

}
