import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,4,5,6};
        int target=5;
        int ans1= linearsearch(arr,target,0);
        ArrayList<Integer> ans=AllIndex(arr,target,0,new ArrayList<Integer>());
        System.out.println(AllIndex2(arr,target,0));
        System.out.println(ans);
        indexs(arr,target,0);
        System.out.println(lis);
        System.out.println(ans);
//        System.out.println(list);
    }
    static int linearsearch(int[] arr,int target,int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return arr[index] == target ? index : linearsearch(arr, target, index + 1);
    }
    static ArrayList<Integer>lis=new ArrayList<>();
    static void indexs(int[] arr,int target,int index) {
        if (index == arr.length - 1) {
            return;
        }
        if (arr[index] == target) {
            lis.add(index);
        }
        indexs(arr, target, index + 1);
    }
    static ArrayList<Integer>AllIndex(int[] arr,int target,int index, ArrayList<Integer>list) {
        if (index == arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return AllIndex(arr, target, index + 1, list);
    }

        static ArrayList<Integer>AllIndex2(int[] arr,int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
            if(index==arr.length-1){
                return list;
            }
            if(arr[index]==target){
                list.add(index);
            }
            ArrayList<Integer>ansfrombeforcalls =AllIndex2(arr,target,index+1);
            list.addAll(ansfrombeforcalls);
            return list;


    }
}
