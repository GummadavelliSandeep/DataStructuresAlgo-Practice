import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch{
    public static void main(String[] args) {
        int arr[]={1,1};
        ArrayList<Integer> ans = setmismatch(arr);
        int ans1[]=setmismatch1(arr);
        System.out.println(ans);
        System.out.println(ans1);
//        System.out.println(Arrays.toString(arr));
    }
    static ArrayList<Integer> setmismatch(int[] arr){
        ArrayList<Integer>list=new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap1(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(arr[j]);
                list.add(j+1);
            }
        }
        return list;
    }
    static void swap1(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    static int[] setmismatch1(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int []{-1,-1};
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
