import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 1, 2};
        selectionsort(arr, 0, arr.length ,0);
        System.out.println(Arrays.toString(arr));

    }

        static void selectionsort(int[] arr, int c, int n,int max) {
            if (n == 0) {
                return;
            }
            if (c < n) {
                if (arr[c] > arr[max]) {
                    selectionsort(arr, c + 1, n, c);
                } else {
                    selectionsort(arr, c + 1, n, max);
                }
            }
            else{
                int temp = arr[max];
                arr[max] = arr[n-1];
                arr[n-1] = temp;
                selectionsort(arr, c = 0, n - 1,0);
            }

        }
}
