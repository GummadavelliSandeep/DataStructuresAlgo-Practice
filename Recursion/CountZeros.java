public class CountZeros {
    static int count(int n ){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        return (n%10)==0?helper(n/10,c+1):helper(n/10,c);
    }

    public static void main(String[] args) {
        System.out.println(count(204000));
    }
}
