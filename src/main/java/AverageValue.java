//Найти среднее арифметическое всех элементов массива.

import java.util.Random;
import java.util.stream.IntStream;

public class AverageValue {

    public static void main(String[] args) {
        Random random = new Random();

        IntStream ints = random.ints(0, 9).limit(5);
        int[] arr = ints.toArray();
        int length = arr.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        double average = sum / arr.length;

        System.out.print("Average: " + average);


    }
}
