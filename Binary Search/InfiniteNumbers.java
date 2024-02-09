public class InfiniteNumbers {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,8,5,12,34,56,78};
        int target=4;
        System.out.println(ans(arr,target));
    }

    private static int ans(int[] arr, int target) {
        int start=0;
        int end=1;
        while(target>arr[end]){
           int temp=end+1;
           end=end+(end-start+1)*2;
           start=temp;
        }
        return Binary(arr,start,end,target);
    }

    private static int Binary(int[] arr, int start, int end, int target) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
