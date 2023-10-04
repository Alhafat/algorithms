package task_2_exсep;

public class stringNotEmpty extends Exception {

    private String value;

    public String getString() {
        return value;
    }

    public stringNotEmpty(String message) {
        super(message);
    }
}

