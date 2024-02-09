public class BinarySearch2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,8,12,34,56,78};
        int target=12;
        System.out.println(Binary(arr,target));
    }
    public static int Binary(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
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
