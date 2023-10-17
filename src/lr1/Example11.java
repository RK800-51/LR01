package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int year = in.nextInt();
        int age = 2023 - year;

        System.out.printf("Имя: %s Возраст: %d", name, age);
        in.close();
    }
}
