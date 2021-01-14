/*
计算1！+2！+3！+...+10!
 */

public class HomeWork11 {
    public static void main(String[] args) {
        int S = 1;
        for (int k = 2; k <= 10; k++) {
            for (int i = (k-1); i >0; i--) {
                k*=i;
            }
            S+=k;
        }
        System.out.println("1-10的阶乘之和为："+S);
    }
}
