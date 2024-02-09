import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            int corect=arr[i]-1;
            if(arr[i]!=arr[corect]){
                swap(arr,i,corect);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
