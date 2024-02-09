public class NumberOfTimesArrayRotated {
    public static void main(String[] args) {
        int arr[]={7,8,1,2,3,4,5,6};
        int target=3;
        int f= peakIndexInMountainArray(arr);
//        System.out.println(f);
        if(f==target){
            System.out.println( f);
        }
        if(f==-1) {
            System.out.println(Binary(arr, target, 0, arr.length - 1));
        }
        if(target>arr[0]) {
            System.out.println(Binary(arr, target, 0, f - 1));
        }
        else{
            System.out.println(Binary(arr,target,f+1,arr.length-1));
        }
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>=arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static int Binary(int[] arr, int target, int low, int high){
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
