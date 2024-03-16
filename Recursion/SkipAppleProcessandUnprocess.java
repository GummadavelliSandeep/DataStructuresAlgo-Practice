public class SkipAppleProcessandUnprocess {
    public static void main(String[] args) {

      skipapple(" ","helloapplewelcome");
}
    static void skipapple(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.startsWith("apple")){
            skipapple(p,up.substring(5));
        }
        else{
            skipapple(p+up.charAt(0),up.substring(1));
        }
    }
}
