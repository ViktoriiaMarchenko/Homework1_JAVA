package Domashnie;

public class DZ2_Zadacha_2 {
    public static void main(String[] args) {
        int a = 123;
        String b = String.valueOf(a);  //перевели число в строку
        String reverse = new StringBuffer(b).reverse().toString();   //буферизует входную строку, реверсируем, сохраняем
        System.out.println("Трехзначное число: " + a);
        System.out.println("Цифры числа в обратном порядке: " + reverse);
    }
}


