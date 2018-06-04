//Поменять наибольший и наименьший элементы массива местами.
// Пример: дан массив {3, -7, 0, 6, 9}.  После замены будет выглядеть {3, 9, 0, 6, -7}.


import java.util.Random;
import java.util.stream.IntStream;

public class MinMax {

    public static void main (String[] args){

        Random random = new Random();

        IntStream ints = random.ints(0,9).limit(5);
         int[] arr = ints.toArray();
         int length = arr.length;
         for (int i=0; i<length; i++){
         System.out.print(arr[i]+" ");
         }

        int minValue = arr[0];
        int maxValue = arr[0];
        int minPosition = 0;
        int maxPosition = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }

        arr[minPosition] = maxValue;
        arr[maxPosition] = minValue;

        System.out.println("new array: ");

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

}
