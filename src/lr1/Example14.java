package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = in.nextInt();
        int a, b, c, d;
        a = x - 1;
        b = x;
        c = x + 1;
        d = (a + b + c);

        System.out.println(a + " " + b + " " + c + " " + d*d);
        in.close();
    }
}
