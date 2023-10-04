package task_2_exсep;

public class stringEmpty {

    public static String getString(String value) throws stringNotEmpty {

        if (value.isEmpty() ^ value == null) {}
            throw new stringNotEmpty("Получена пустая строка. Произведите корректный ввод!");
    }
}