public class StringSkipApple {
    public static void main(String[] args) {
        String str="Helloworld";
//        str.startsWith("Apple");
        System.out.println(skipapple("helloapplewelcome"));
    }
    static String skipapple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipapple(up.substring(1));
        }
    }
}
