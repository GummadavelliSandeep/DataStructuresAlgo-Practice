public class PrintingNofrom1toN {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        print(5);
    }
}
