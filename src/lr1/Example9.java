package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего месяца: ");
        String month = in.nextLine();

        System.out.println("Введите общее число дней в месяце: ");
        int num = in.nextInt();

        System.out.printf("Месяц: %s Количество дней в месяце: %d", month, num);
        in.close();
    }
}
