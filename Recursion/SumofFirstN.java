public class SumofFirstN {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        int k=sum(2);
        System.out.println(k);
    }
}
