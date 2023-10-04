package task_2_exсep;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите не пустую строку: \n");
            String value = in.nextLine();

            String result = stringEmpty.getString(value);
            System.out.printf("Данные введены корректно. Полученые параметры: " + result);
            in.close();
        } catch (stringNotEmpty ex) {
            System.out.println(ex.getMessage());
        }
    }
}





