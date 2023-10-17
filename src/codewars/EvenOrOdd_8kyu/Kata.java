package codewars.EvenOrOdd_8kyu;

public class Kata {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        // Проверка работы функции
        String result2 = evenOrOdd(2);
        String result1 = evenOrOdd(1);
        System.out.println(result2);
        System.out.println(result1);
    }
}


