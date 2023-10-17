package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = in.nextInt();

        System.out.println("Введите второе число: ");
        int y = in.nextInt();

        int summ = x + y;
        int dif = x - y;

        System.out.printf("Сумма: %d Разность: %d", summ, dif);
        in.close();
    }
}
