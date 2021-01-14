/*
从控制台接受一个正整数，判断该数字是否为质数（质数指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
 */
import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int A=s.nextInt();
        int k=0;
        for (int i=2;i<A;i++){
            if(A%i==0){
                k+=1;
            }
        }
        //System.out.println(k);
        if (k == 0) {
            System.out.println("该数为质数");
        }
        else {
            System.out.println("该数不是质数");
        }

    }
}
