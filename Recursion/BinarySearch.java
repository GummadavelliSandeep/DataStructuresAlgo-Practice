public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=9;
        int start=0;
        int end=arr.length-1;
        boolean flag= search(arr,target,start,end);
        System.out.println(flag);
    }
    static boolean search(int[] arr,int target,int start,int end){
        if(start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return true;
        }
        return arr[mid]>target?search(arr,target,start,end=mid-1):search(arr,target,start=mid+1,end);
    }
}
