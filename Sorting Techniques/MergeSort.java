import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {174 ,165 ,142 ,212 ,254 ,369 ,48 ,145 ,163 ,258 ,38 ,360, 224, 242, 30, 279 ,317 ,36 ,191 ,343 ,289, 107 ,41 ,443 ,265 ,149 ,447 ,306 ,391 ,230 ,371 ,351 ,7 ,102};
        int start = 0;
        int end = arr.length - 1;
        int max=Arrays.stream(arr).max().getAsInt();/*Getting the maximum element from the given array*/
        System.out.println(max);
       divide(arr, start, end);
       System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
    static int count=0;
    static void divide(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conqure(arr, start, mid, end);
    }

    static void conqure(int[] arr, int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int index1 = start;
        int index2 = mid + 1;
        int k = 0;
        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                merged[k] = arr[index1];
                index1++;
                k++;
            } else {
                merged[k] = arr[index2];
                index2++;
                k++;
                count += (mid - index1 + 1);/*Inversions count in java using merge sort*/
            }
        }
        while (index1 <= mid) {
            merged[k] = arr[index1];
            index1++;
            k++;
        }
        while (index2 <= end) {
            merged[k] = arr[index2];
            index2++;
            k++;
        }
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}


