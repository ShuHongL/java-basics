/*
从控制台接收一个正整数，计算该数的阶乘。例如输入5，阶乘为5*4*3*2*1；
 */
/*
import java.util.Scanner;
 public class SwitchTest2{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    }
}
创建键盘扫描器对象的另一种写法
*/

public class HomeWork3 {
    public static void main(String[] args){
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("请输入一个数：");
        int G=s.nextInt();
        int C=1;
        for (int i=1;i<=G;i++){//或者递减的方法，i=G；i>1;i--;
            C*=i;
        }
        System.out.println("这个数的阶乘为："+C);
    }
}
