public class ReverseNumber {
    static int Reverse(int n,int c){
        if(n%10==n){
            return n;
        }
        return n%10*(int)Math.pow(10,c)+Reverse(n/10,c-1);
    }

    public static void main(String[] args) {
        int n=121;
        int c = (int) Math.log10(n) + 1;
        int m = Reverse(121, c-1);
        System.out.println(n==m);
        System.out.println(m);

    }
}
