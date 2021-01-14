/*
计算1+2-3+4-5...+100的结果？
 */

public class HomeWork2 {
    public static void main(String[] args) {
        //方法一：从1-100中取一个数就判断一下是奇数还是偶数，奇数为负，偶数为正；
        /*int S = 1;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 1) {
             S=S-i;//注意这里不能直接用i=-i;会影响更新导致死循环。
            }
            else{
                S=S+i;
            }
        }
        System.out.println(S);
         */
        //方法二：将奇数减在一起，将偶数加在一起，最后求和；
        int S1=1;
        int S2=0;
        int S3=0;
        for (int k=2;k<=100;k++){
            if (k % 2 == 1) {
                S1-=k;
            }
            else{
                S2+=k;
            }
        }
        S3=S1+S2;
        System.out.println(S3);
    }
}
