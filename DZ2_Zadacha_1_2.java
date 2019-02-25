package Domashnie;

public class DZ2_Zadacha_1_2 {

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        System.out.println("переменная а: " + a + "\n" + "переменная b: " + b);


        a = a ^ b;          //a=7^9   111^1001=0111^1001=1110=14
        b = a ^ b;          //b=14^9  1110^1001=0111=7
        a = a ^ b;          //a=14^7  1110^0111=1001=9

        System.out.println("переменная а: " + a + "\n" + "переменная b: " + b);
}
}
