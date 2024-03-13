public class CharFreq {
    public static void main(String[] args) {
        String str="  aabbbbeeeeffggg".trim();
        System.out.println(str);
        String str2="";
        for(int i=0;i<str.length();i++){
            int count=1;
            if(i>0 && str.charAt(i-1)==str.charAt(i)){
                continue;
            }
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            str2=str2+str.charAt(i)+count;
        }
        System.out.println(str2);
    }
}
