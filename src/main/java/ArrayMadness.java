//Создайте массив, содержащий 10 первых нечетных чисел.
// Выведете элементы массива на консоль в одну строку, разделяя запятой.

public class ArrayMadness {

    public static void main (String [] args){

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++){
            numbers[i]=i*2+1;

            if (i<9) {

                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }

        }

    }
}
