public class ColumnNameFromGivenColumnName {
    public static void main(String[] args) {
        long n=28;
        java.lang.StringBuilder sb=new java.lang.StringBuilder();
        while(n-->0){
            sb.append( (char)((int)(n%26)+'A'));
            n=n/26;
        }
        System.out.println(sb.reverse().toString());
        System.out.println((char)((int)(1)+'A'));
    }
}
