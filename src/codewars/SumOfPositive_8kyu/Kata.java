package codewars.SumOfPositive_8kyu;

public class Kata {
    public static int sum(int[] arr){
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            if(arr[i] > 0) {
                sum += arr[i];  }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Проверка работы функции
        int[] array1 = {1, 2, -3, 8};
        int[] array2 = {-1, -2, -3, -8};
        int result1 = sum(array1);
        int result2 = sum(array2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
