import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n=arr.length-1;
        quicksort(arr,0,n);
        System.out.println(Arrays.toString(arr));
//        System.out.println(n);
    }
   static void quicksort(int[] arr,int start,int end){
        if(start>end){
            return;
        }
         int k=partion( arr,start,end);
            quicksort(arr,start,k-1);
            quicksort(arr,k+1,end);
   }
   static int partion(int[] arr, int start, int end){
        int pivot=arr[start];
        int i=start;
        int j=end;
        while(i<j){
            while(arr[i]<=pivot && i<=end-1 ){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        int temp=arr[start];
        arr[start]=arr[j];
        arr[j]=temp;
       return j;
   }
}

