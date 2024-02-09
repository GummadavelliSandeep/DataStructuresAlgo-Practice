import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 1, 2};
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){  /* works by repeatedly swapping adajacent elements if they are not in proper order */
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if (flag==true){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
