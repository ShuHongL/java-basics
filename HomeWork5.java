/*
从键盘接收一个正整数，该正整数作为行数，输出以下图形
       *
      ***
     *****
    .........
 */
//每行需输入“空格”和 “*”
import java.util.Scanner;
public class HomeWork5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("请输入行数：");
        int h=s.nextInt();
        for (int i=1;i<=h;i++){
            for (int m=(h-i);m>0;m--){//空格与星号并列输出所以是for并行，找准空格的数量关系第i行有（h-i）个空格才输出星号；
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
