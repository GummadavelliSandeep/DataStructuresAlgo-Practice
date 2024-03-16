public class SortedArrayOrNot {
    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,6,7};
        int n=arr.length;
        boolean flag=Search(arr,0);
        System.out.println(flag);
    }
//    static boolean Search(int[] arr, int n, int s, int e){
//        if(e==n){
//            return true;
//        }
        static boolean Search(int[] arr, int index) {
            if (index == arr.length - 1) {
                return true;
            }

        return arr[index]<=arr[index+1]?Search(arr,index+1):false;
    }
}
