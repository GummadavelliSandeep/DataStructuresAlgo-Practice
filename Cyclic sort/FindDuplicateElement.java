import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2,3};
      ArrayList<Integer>ans = FindDuplicate(arr, new ArrayList<Integer>());
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static ArrayList<Integer> FindDuplicate(int[] arr, ArrayList<Integer>list){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else if(arr[i]==arr[correct]){
                i++;
            }
            else{
                i++;
            }
        }
        list.add(arr[arr.length-1]);
        return list;
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
