//Пользователь вводит(через консоль) набор чисел в виде одной строки
//например (“1, 2, 3, 4, 4, 5”). Избавиться от повторяющихся элементов
//в строке и вывести результат на экран. Сделать проверку - если пользователь
//ввел 3 или меньше чисел, предложить ввести числа еще раз пока не будет больше 3х чисел

import java.util.*;

public class NumberSet {

    public static void main(String[] args)  {
        String userRow;

        Scanner scanner = new Scanner(System.in);
        System.out.print("type numbers and press Enter: ");
        userRow = scanner.nextLine();
        System.out.println(userRow);
        String[] userArray = userRow.split(",");
        System.out.println("number of elems:"+ userArray.length);

        if (userArray.length<3){
            System.out.println("Please try again. Type at least 3 numbers separated by comma");
        } else {
            Set <String> mySet = new HashSet<String>(Arrays.asList(userArray));
            System.out.print(mySet);

        }

    }


}
