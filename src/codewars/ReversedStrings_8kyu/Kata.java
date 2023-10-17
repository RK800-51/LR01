package codewars.ReversedStrings_8kyu;

public class Kata {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // Проверка работы функции
        String result = solution("world");
        System.out.println(result);

    }
}
