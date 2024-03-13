public class StringFrontHash {
    public static void main(String[] args) {
        String str="Move#Hash#to#Front";
        String str2="";
        String str3="";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == '#') {
                str2 = str2 + str.charAt(i);
            } else {
                str3 = str3 + str.charAt(i);
            }
        }
        String restult=str2.concat(str3);
        System.out.println(restult);
    }
}
