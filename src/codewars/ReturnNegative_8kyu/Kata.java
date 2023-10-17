package codewars.ReturnNegative_8kyu;

public class Kata {
    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        }
        else if (x < 0) {
            return x;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        // Проверка работы функции
        int result1 = makeNegative(1);
        int result2 = makeNegative(-1);
        int result3 = makeNegative(0);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
