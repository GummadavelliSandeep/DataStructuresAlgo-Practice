import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 1, 2};
        bublesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void bublesort(int[] arr, int c, int n) {
        if (n == 0) {
            return;
        }
        if (c < n) {
            if (arr[c] >= arr[c + 1]) {
                int temp = arr[c + 1];
                arr[c + 1] = arr[c];
                arr[c] = temp;
            }
            bublesort(arr, c + 1, n);
        }
        else{
                bublesort(arr, c = 0, n - 1);
            }

        }
    }
