public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(count(14));
    }
    static int count(int n){
        return helper(n,0);
    }
    static int  helper(int n,int steps){
        if(n==0){
            return steps;
        }
        return n%2==0?helper(n/2,steps+1):helper(n-1,steps+1);
    }
}
