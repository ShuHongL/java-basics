/*
    计算1000以内所有不能被7整除的整数之和
 */
public class Homework1 {
    public static void main(String[] args){
        int S=0;
        for (int i=0;i<=1000;i++){
            if (i % 7 != 0) {
                S=S+i;//S +=i;
                System.out.println("i="+i);
            }
        }
        System.out.println("S="+S);
    }
}
