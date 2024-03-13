public class specilfibo {
    public static void main(String[] args) {
        int n=2;
        System.out.println(f(2)%47);
    }
    static int f(int n){
        if(n==0||n==1){
            return 1;
        }
        return (f(n-1)*f(n-1))+(f(n-2)*f(n-2));

    }
}
