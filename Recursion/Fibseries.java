public class Fibseries {
    static boolean fib(int n) {
        if (n == 1) {
            System.out.println(1);;
        }
        if(n==2){
            System.out.println(2);;
        }
        System.out.println(fib(n-1));
        System.out.println(fib(n-2));
        return false;
    }
    public static void main(String[] args) {

        System.out.println(fib(2));
    }
}
