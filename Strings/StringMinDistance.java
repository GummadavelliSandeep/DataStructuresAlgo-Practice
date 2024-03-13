public class StringMinDistance {
    public static void main(String[] args) {
        String str="Hello welcome to java programming";
        String w1="welcome";
        String w2="programming";
        int min1 = 0,min2=0;
        String words[]=str.split(" ");
        for(int i=0;i< words.length;i++){
            if (words[i].equals(w1)){
                min1=i+1;

            } else if (words[i].equals(w2)) {
                min2=i;
            }
        }
//        for(int i=0;i<words.length;i++){
//            if (words[i].equals(w2)) min2 = i;
//        }
        System.out.println(min2-min1);
    }
}
