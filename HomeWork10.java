/*
猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个。第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
以后每天早上都吃了前一天的剩下的一半零一个，到第10天早上想再吃时，只剩下一个桃子了，求一天共摘了多少桃子？
 */
public class HomeWork10 {
    public static void main(String[] args){
        double S=0.0;
        for (int i=1;i<=10;i++){
            S+=1.5;
        }
        System.out.println("一天一共摘了"+(S+1)+"个桃子");
    }
}
