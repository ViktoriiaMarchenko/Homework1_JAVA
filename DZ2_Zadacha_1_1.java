package Domashnie;

public class DZ2_Zadacha_1_1 {

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        System.out.println("переменная а: " + a + "\n" + "переменная b: " + b);

        b=b-a;
        a=a+b;          //a=a+(b-a)=a+b-a=b
        b=a-b;          //b=b-(b-a)=b-b+a=a
        System.out.println("переменная а: " + a + "\n" + "переменная b: " + b);

    }
}

