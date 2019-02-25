package Domashnie;
import java.util.Scanner;

public class DZ2_Zadacha_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес в фунтах: ");
        String lb = scanner.next();

        double pounds = Integer.parseInt(lb);

        double kg = pounds*453.6/1000;     //переводим фунты в кг

        int kg1 = (int)kg;                //выделяем целую часть из веса в кг


        double kg2 = kg - kg1;           //останется дробная часть. Это граммы
        String str =  String.valueOf(kg2);     //меняем тип данных для граммов из численного на массив
        String new_str = str.substring(2,5);     //чтоб вывести граммы без 0 выводим элементы массива со 2 по 5


        System.out.print(lb + " фунтов = "+ kg1 + " кг " + new_str);

        //System.out.format("%.3f", str);       //приведем дробную часть к виду 3 знака после запятой

        System.out.println(" г");

    }
}
