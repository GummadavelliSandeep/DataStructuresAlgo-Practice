public class FindInMountainPeak{
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 2, 1};
        int target = 3;
        int f = peakIndexInMountainArray(arr);
        System.out.println(f);
    }
/*
        int l=Binary1(target,arr,f);
        int r=Binary2(target,arr,f);
        if (target==arr[l]){
            System.out.println(l);
        }else{
            System.out.println(r);
        }
    }
*/
        public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
//    public static int Binary1(int target,int[] arr,int f){
//        if(target>f){
//            int low=f+1;
//            int high=arr.length-1;
//            while(low<=high){
//                int mid=low+(high-low)/2;
//                if(arr[mid]==target){
//                    return mid;
//                }
//                else if(arr[mid]>target){
//                    high=mid-1;
//                }
//                else{
//                    low=mid+1;
//                }
//            }
//        }
//        return 0;
//    }
//    public static int Binary2(int target, int[] arr,int f){
//        if(target<f){
//            int low=0;
//            int high=f-1;
//            while(low<=high){
//                int mid=low+(high-low)/2;
//                if(arr[mid]==target){
//                    return mid;
//                }
//                else if(arr[mid]>target){
//                    high=mid-1;
//                }
//                else{
//                    low=mid+1;
//                }
//            }
//
//        }
//        return 0;
//    }
}
