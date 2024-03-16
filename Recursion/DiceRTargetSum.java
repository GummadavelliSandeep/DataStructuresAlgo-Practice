public class DiceRTargetSum {
    public static void main(String[] args) {
        DiceRol("",4);
    }
    static void DiceRol(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<6 &&i<=target;i++){
            DiceRol(p+i,target-i);
        }
    }
}
