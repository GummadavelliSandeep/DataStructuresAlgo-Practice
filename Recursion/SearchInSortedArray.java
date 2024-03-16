public class SearchInSortedArray {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
        int target=2;
        int start=0;
        int end=arr.length-1;
        int k=search(arr,target,start,end);
        System.out.println(k);
    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            return (target>=arr[start] && target<=arr[mid])?search(arr,target, start,mid-1):search(arr,target,mid+1,end);
            }
        return (target>=arr[mid] && target<=arr[end])?search(arr,target,mid+1,end):search(arr,target,start,mid-1);
         }
    }

