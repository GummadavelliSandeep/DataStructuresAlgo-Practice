public class SumOfDigits {
    static int sumNo(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumNo(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumNo(123));
    }
}
