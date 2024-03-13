public class LongestPrefix {
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geeks", "geezer"};
        int n = arr.length;
        String res = longprefix(arr, n);
        System.out.println(res);

    }


    private static String longprefix(String[] arr, int n) {
            if(n == 0)
                return "-1";

            if(n == 1)
                return arr[0];

            String prefix = arr[0];
            for(int i = 1; i<n; i++)
            {
                while(arr[i].indexOf(prefix) != 0)
                    prefix = prefix.substring(0, prefix.length()-1);
            }
            if(prefix.equals(""))
                return "-1";
            return prefix;
           }
}
