public class StringRotatedOrNot {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="forgeeksgeeks";
        s1=s1+s1;
        System.out.println(s1);
        boolean flag=s1.contains(s2);
        System.out.println(flag);
    }
}
