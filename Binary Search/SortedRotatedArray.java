public class SortedRotatedArray {
    public static void main(String[] args) {
        int arr[]= {4, 5, 6, 7, 0, 1, 2};
        int target=0;
        int b=Binary(arr,target);
        System.out.println(b);
    }

    private static int Binary(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else if(target>arr[mid] && arr[mid]<=arr[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
}
