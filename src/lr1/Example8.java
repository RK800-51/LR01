package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели: ");
        String day = in.nextLine();

        System.out.println("Введите название текущего месяца: ");
        String month = in.nextLine();

        System.out.println("Введите номер дня в месяце: ");
        int num = in.nextInt();

        System.out.printf("День недели: %s День: %d Месяц: %s", day, num, month);
        in.close();
    }
}
