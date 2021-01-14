/*
小芳的妈妈每天给她2.5元钱，她会存起来。但是，每当这一天是存钱的第五天或者5的倍数时（第n个五天），她都会花去6元钱，请问，经过多少天，小芳才可以存到100元？
 */
//while循环 + 计数 （附加练习）
public class HomeWork6 {
    public static void main(String[] args){
       //方法一:for循环
        /*double S=0.0;
        int k=0;
        for (int i=1;i>0;i++){
            S+=2.5;
            if (i % 5 == 0) {
               S-=6;
           }
            k=i;
            if (S>=100)
                break;
        }
        System.out.println("这是存钱的第"+k+"天");
        System.out.println("S="+S);
         */
        //while循环
        int k=0;
        double S=0.0;
        while (S<100.0) {
            S+=2.5;
            k++;
            if (k % 5 == 0) {
                S-=6;
            }
            if (S >= 100.0) {
                break;
            }
        }
        System.out.println(S);
        System.out.println("这是她存钱的第"+k+"天。");
    }
}
