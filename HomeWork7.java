/*
一个数如果恰好等于它的因子之和，这个数就是完数，例如6=1+2+3，编程找出1000内的所有完数？
 */
public class HomeWork7 {
    public static void main(String[] args){

        for (int k=1;k<=1000;k++){
            int S=0;//计数时要归零，进行重新计数
            //System.out.println("k="+k);
            for (int i=1;i<k;i++){
                if(k%i==0){
                    S +=i;
                }
            }
            //System.out.println(S);
            if (k == S) {
               System.out.println("k="+k);
            }
        }
    }
}
