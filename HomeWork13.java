/*
一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的三倍，这个四位数是多少？
 */
//import java.util.Scanner;
public class HomeWork13 {
    public static void main(String[] args){
        //Scanner s=new Scanner(System.in);
        //System.out.print("请输入一个四位数：");
        //int g=s.nextInt();
        for (int i=1000;i<=9999;i++){
            int a=i/1000;
            if(3*(i-a*1000)==i){
                System.out.println("这个四位数是："+i);
            }
        }
    }
}
