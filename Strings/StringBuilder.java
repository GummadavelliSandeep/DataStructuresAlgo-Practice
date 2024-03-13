import  java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        String str="Hello welcome to javatpoint";
        String str1=str.replace('e','a');
        System.out.println(str1);
        StringBuffer sb=new StringBuffer("Hello");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java


    }
}
