public class StringPalindrome {
    public static void main(String[] args) {
        String str="N2 i&nJA?a& jnI2n";
        String s=str.replaceAll("[^a-zA-Z0-9\\+]","");
        String s1=s.toLowerCase();
        for(int i=0,j=s1.length()-1;i<s1.length() && i>=0;i++,j--){
            if(s1.charAt(i)!=s1.charAt(j)){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
