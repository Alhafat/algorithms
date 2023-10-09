package task_3_excep;


/*Иванов Иван Иванович 10.10.2001 1234567890 m*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserDataValidator {
    public static void main(String[] args) {
        // Ввод данных пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные пользователя:");
        String input = scanner.nextLine();

        // Разделение введенных данных по пробелам
        String[] data = input.split(" ");

        // Проверка количества данных
        if (data.length != 6) {
            if (data.length < 6) {
                throw new RuntimeException("Вы ввели меньше данных, чем требуется!");
            } else {
                throw new RuntimeException("Вы ввели больше данных, чем требуется!");
            }
//            return;
        }

        // Извлечение данных из массива
        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String birthDate = data[3];
        int phoneNumber = Integer.parseInt(data[4]);
        char gender = data[5].charAt(0);

        // Проверка формата данных
        boolean isValid = true;

        var dateReg = "\\d{2}\\.\\d{2}\\.\\d{4}";

        if (!birthDate.matches(dateReg)) {
            throw new RuntimeException ("Дата рождения должна быть указана в формате dd.mm.yyyy.");
//            isValid = false;
        }

        if (gender != 'f' && gender != 'm') {
            throw new RuntimeException("Пол должен быть указан символом 'f' или 'm'");
        }

        if (!isValid) {
            return;
        }


        // Вывод введенных данных
        System.out.println("Получены следующие данные: ");
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Пол: " + gender);


        write_new_file(lastName, data);
        scanner.close();
    }

    public static void write_new_file(String lastName, String[] data) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(lastName + ".txt", true), StandardCharsets.UTF_8))) {
            writer.write("--------------------------------------");
            writer.newLine();
            for (String datum : data) {
                writer.write(datum + "\t");
            }
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

