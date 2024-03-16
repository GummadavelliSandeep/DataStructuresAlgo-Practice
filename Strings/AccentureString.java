public class AccentureString {
    public static void main(String[] args) {
        String str="saveChangesIn";
        String str1="";
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                str1=str1+Character.toUpperCase(str.charAt(i));
            }
            if(Character.isUpperCase(str.charAt(i))){
                str1=str1+Character.toLowerCase(str.charAt(i));
            }
      }
        System.out.println(str1);
        String str2="";
        for(int i=0;i<str1.length();i++){
            if(Character.isUpperCase(str1.charAt(i))){
                str2=str2+str1.charAt(i);
            }
            else {
                System.out.println(str2);
                str2 = "";
                str2 = str2 + str1.charAt(i);
            }
            }
        System.out.println(str2);
        }
    }

