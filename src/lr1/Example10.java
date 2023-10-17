package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш год рождения: ");
        int year = in.nextInt();

        int x = 2023 - year;

        System.out.printf("Возраст: %d", x);
        in.close();
    }
}
