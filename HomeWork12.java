/*
一球从100米高度自由下落，每次落地反跳回原高度的一半再下落，求它在第10次落地时，共经过多少米？
 */

public class HomeWork12 {
    public static void main(String[] args){
        double high=100;
        for (int i=10;i>0;i--){
            high/=2;
        }
        System.out.println("小球共经过"+(100-high)+"米");
    }
}
