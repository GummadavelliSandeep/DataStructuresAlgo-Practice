public class SpecialCharacterRemoving {
    public static void main(String[] args) {
        String str="Hello   world this is sandeep";
        str=str.replaceAll("[^a-zA-z0-9\\s+-]","");
        str=str.replaceAll("[^0-9-]","");
//        int n=Integer.parseInt(str);
        System.out.println(str);
    }
}
