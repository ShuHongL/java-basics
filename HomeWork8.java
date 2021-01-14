/*
给一个不多于5位的正整数，
要求：
一、求它是几位数；
二、逆序打印出各位数；
 */
public class HomeWork8 {
    public static void main(String[] args){
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("请输入一个不多余五位的正整数：");
        int A=s.nextInt();
        int a=A/10000;
        int b=(A/1000)%10;
        int c=(A/100)%10;
        int d=(A/10)%10;
        int e=A%10;
        int S=0;
        int F=0;
        if(a!=0){
             S=5;
             F=e*10000+d*1000+c*100+b*10+a;
        }else{
            if (b != 0) {
                 S=4;
                 F=e*1000+d*100+c*10+b;
            }else{
                if (c != 0) {
                     S=3;
                     F=e*100+d*10+c;
                }else{
                    if (d != 0) {
                         S=2;
                         F=e*10+d;
                    }else{
                         S=1;
                         F=e;
                    }
                }
            }
        }
        System.out.println("该数为"+S+"位数");
        System.out.println("该数逆序输出为："+F);
    }
}
