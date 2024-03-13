public class MidUpperLower {
    public static void main(String[] args) {
        String str="This is CloudTech This is CloudTech";
        int n=str.length()/2;
        int N=6;
        String lower=" ";
        String upper=" ";
        System.out.println(Character.getNumericValue(str.charAt(0)));
        System.out.println((int)Math.sqrt(N));
        for(int i=0;i<str.length();i++){
            if(i<n){
                lower=lower+Character.toLowerCase(str.charAt(i));

            }
            else{
                upper=upper+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(lower.concat(upper));
    }
}
