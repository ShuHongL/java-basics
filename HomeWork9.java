/*
题目：一个5位数，判断它是不是回文数，及12321是回文数，个位与万位相同，十位与千位相同
 */

public class HomeWork9 {
    public static void main(String[] args){
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("请输入一个五位数：");
        int S=s.nextInt();
        int a=S/10000;
        int b=(S/1000)%10;
        int c=(S/100)%10;
        int d=(S/10)%10;
        int e=S%10;
        if (a == e && b == d) {
            System.out.println("这个数是回文数");
        }
            else {
                System.out.println("这个数不是回文数");
            }
    }
}
