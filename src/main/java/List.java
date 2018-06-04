// создаем список(ArrayList) строк, считываем 5 строк с клавиатуры
// и добавляем их в список, затем находим самую короткую строку и
// выводим её на экран. Если таких строк несколько — выводим их все,
// каждую с новой строки.


import java.util.Scanner;
import java.util.ArrayList;

public class List {


    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i <5){
            String s = getUserRow();
            list.add(s);
            i++;

        }
        System.out.println(list);


        String shortest = list.get(0);

        for(String str : list) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        System.out.println("The shortest string: " + shortest);


    }


    public static String getUserRow() {
        String userRow;

        Scanner scanner = new Scanner(System.in);
        System.out.print("type row and press Enter: ");
        userRow = scanner.next();
        return userRow;

    }


}
