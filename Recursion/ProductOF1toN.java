public class ProductOF1toN {
    static int product(int n){
        if(n<=1){
            return 1;
        }
        return n*product(n-1);
    }
    public static void main(String[] args) {
        int n=product(3);
        System.out.println(n);
    }
}
