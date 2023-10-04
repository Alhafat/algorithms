package task_2_exсep;

import org.apache.commons.lang.StringUtils;

public class stringEmpty {

    public static String getString(String value) throws stringNotEmpty {

        if (value.isEmpty() || value == null || StringUtils.isBlank(value)) {
            throw new stringNotEmpty("Получена пустая строка. Произведите корректный ввод!");}
        return value;
    }

}