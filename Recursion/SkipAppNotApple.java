public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipapp("helloappl"));
    }
    static String skipapp(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipapp(up.substring(3));
        }
        else{
            return up.charAt(0)+skipapp(up.substring(1));
        }
    }
}
