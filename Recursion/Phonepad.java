public class Phonepad {
    public static void main(String[] args) {
        phonepad("","12");
        System.out.println(phonecount("","12"));

    }
    static void phonepad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*1)*3;i++){
            char ch=(char)('a'+i);
            phonepad(p+ch,up.substring(1));

        }
    }
    static int phonecount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*1)*3;i++){
            char ch=(char)('a'+i);
            count+=phonecount(p+ch,up.substring(1));

        }
        return count;
    }
}
