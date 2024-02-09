import java.util.Arrays;

public class InserationSort {
//    static void swap(int[] arr,int n,int m){
//        int temp=arr[n];
//        arr[n]=arr[m];
//        arr[m]=temp;
//    }
    public static void main(String[] args) {
        int arr[] = {7, 4  , 5, 6, 1, 2};
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
//                    swap(arr,j,j-1);
                }
                else{
                        break;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));

    }
}
