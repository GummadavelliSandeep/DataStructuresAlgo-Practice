public class FindPeakSortedRotatedArray {
    public static void main(String[] args) {
        int arr[]={66, 67, 7 ,10, 14, 19, 27, 33, 36, 40 ,44 ,54 ,60};
        int f= peakIndexInMountainArray(arr);
        System.out.println(f);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

}
