public class SortedRotatedArrayMethod2 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};
        int target=0;
        int pivot=FindPivot(arr);
        System.out.println(pivot);
        if(pivot==target){
            System.out.println(pivot);
        }
        if(target>=arr[0]){
            System.out.println(Binary(arr,target,0,pivot-1));
        }
        else{
            System.out.println(Binary(arr,target,pivot+1,arr.length-1));
        }
    }

    private static int FindPivot(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;

            }

        }
        return low;
    }

    private static int Binary(int[] arr, int target, int low, int high) {
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
