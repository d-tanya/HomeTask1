//Создайте массив из 13 случайных целых чисел из отрезка [-1;1],
// выведите массив на экран в строку. Определите какой элемент
// встречается в массиве чаще всего и выведите об этом сообщение на экран (element + count).

import java.util.Random;
import java.util.stream.IntStream;

public class MaxCount {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream ints = random.ints(-1, 1).limit(13);
        int[] arr = ints.toArray();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == -1) {
                counter1++; }
                else if (arr[i] == 0) {
                        counter2++; }
                    else {
                            counter3++;
                        }

                }

                if ((counter1 > counter2) & (counter1> counter3)){
            System.out.print("-1: "+counter1);
                } else if ((counter2>counter1)&(counter2>counter3)){
            System.out.print("0: "+counter2);
                } else if ((counter3>counter1)&(counter3>counter2)){
            System.out.print("1: "+counter3);
                } else {

                    System.out.println("Looks like several elements have max count. Please see results: ");
                    System.out.println("-1: " + counter1);
                    System.out.println("0: " + counter2);
                    System.out.print("1: " + counter3);
                }

    }
}
