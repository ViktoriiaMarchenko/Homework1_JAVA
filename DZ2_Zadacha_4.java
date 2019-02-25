package Domashnie;
import java.util.Scanner;

public class DZ2_Zadacha_4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите сумму депозита: ");
        String depos = scanner1.next();
        float deposit = Float.parseFloat(depos);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите количество месяцев: ");
        String mon = scanner2.next();
        int month = Integer.parseInt(mon);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите процент годовых: ");
        String perc = scanner3.next();
        double percent = Double.parseDouble(perc);


        for(int i=1;i<month+1;i++){
            deposit += (deposit*percent)/100;

            System.out.format("Месяц - "+ i + ". Сумма: "+ "%,.2f гривен\n", deposit);
        }
        System.out.format("\nЗа "  + month + " месяцев вы получили %,.2f гривен\n", deposit);
}
        }