public class Stringtotalsum {
    public static void main(String[] args) {
        String str="4hello23";
        int totalsum=0;
        String currentNum="";
        for(int i=0;i<str.length()-1;i++){
            if(Character.isDigit(str.charAt(i))){
                currentNum=currentNum+String.valueOf(str.charAt(i));
            }
            else{
                    totalsum = totalsum + Integer.parseInt(currentNum);
                    currentNum ="";
                }
            }
        if(!currentNum.isEmpty()){
            totalsum=totalsum+Integer.parseInt(currentNum);
        }
        System.out.println(totalsum);
    }
}
